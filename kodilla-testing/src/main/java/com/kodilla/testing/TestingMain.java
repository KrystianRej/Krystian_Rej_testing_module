package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args){
        SimpleUser user = new SimpleUser("theForumUser");

        String result = user.getUsername();
        if(result.equals("theForumUser"))
        {
            System.out.println("test OK");
        }
        else
        {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        double result2 = calculator.add(5,3);
        double result3 = calculator.substract(5,3);
        if(result2 == 8 && result3 == 2)
        {
            System.out.println("Test 2 OK");
        }
        else
        {
            System.out.println("Error 2");
        }
    }

}
