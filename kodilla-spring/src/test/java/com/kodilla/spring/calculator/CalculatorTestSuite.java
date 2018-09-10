package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(5,3);
        double subResult = calculator.sub(5,3);
        double mulResult = calculator.mul(4,4);
        double divResult = 0;
        try {
            divResult = calculator.div(4,2);
        } catch(ArithmeticException e) {
            System.out.println("Niedozwolone dzielenie przez zero");
        }
        double divResult2 = 0;
        try {
            divResult2 = calculator.div(4,0);
        } catch(ArithmeticException e) {
            System.out.println("Niedozwolone dzielenie przez zero");
        }
        //Then
        Assert.assertEquals(8, addResult,0);
        Assert.assertEquals(2, subResult, 0);
        Assert.assertEquals(16, mulResult, 0);
        Assert.assertEquals(2, divResult, 0);
        Assert.assertEquals(0, divResult2, 0);
    }
}
