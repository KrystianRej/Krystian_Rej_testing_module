package com.kodilla.stream;

public class Reverse {
    public static int ReversTheNumber(int x) {
        String temporary = String.valueOf(x);
        String result = "";
        for (int i = temporary.length() - 1; i >= 0; i--) {
            result += temporary.charAt(i);
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(ReversTheNumber(17868));
    }
}
