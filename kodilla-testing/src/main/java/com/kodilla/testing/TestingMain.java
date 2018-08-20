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

        Calculator calculator = new Calculator(5,3);
        double result2 = calculator.add();
        double result3 = calculator.substract();
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
