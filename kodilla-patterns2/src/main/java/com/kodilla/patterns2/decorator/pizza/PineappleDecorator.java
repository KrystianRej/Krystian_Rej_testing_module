package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PineappleDecorator extends AbstractPizzaDecorator{
    public PineappleDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pineapple on pizza? Absolutely barbaric!";
    }
}
