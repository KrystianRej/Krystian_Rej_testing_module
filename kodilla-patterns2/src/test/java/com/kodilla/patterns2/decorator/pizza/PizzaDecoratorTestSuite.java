package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaDecoratorTestSuite {
    @Test
    public void testBasicPizzaWithExtraCheeseTomatoesSalamiForbiddenIngredientGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new TomatoesDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new PineappleDecorator(pizza);
        //When
        BigDecimal cost = pizza.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(35), cost);
    }
    @Test
    public void testBasicPizzaWithExtraCheeseTomatoesSalamiForbiddenIngredientGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new TomatoesDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new PineappleDecorator(pizza);
        //When
        String description = pizza.getDescription();
        System.out.println(description);
        //Then
        assertEquals("The composition of pizza: dough, tomato sauce, mozzarella cheese, " +
                "extra cheese, tomatoes, salami, Pineapple on pizza? Absolutely barbaric!", description);
    }
}
