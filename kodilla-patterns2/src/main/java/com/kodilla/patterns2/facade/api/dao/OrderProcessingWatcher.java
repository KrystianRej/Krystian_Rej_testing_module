package com.kodilla.patterns2.facade.api.dao;

import com.kodilla.patterns2.dao.calculator.Watcher;
import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class OrderProcessingWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId , Object object) {
        LOGGER.info("class: " + object.getClass().getName() + ", Args: " + order + ", " + userId);
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEventWhenError() {
        LOGGER.info("Exception has been handled");
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (end - begin) + " ms ");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }

        return result;
    }

}
