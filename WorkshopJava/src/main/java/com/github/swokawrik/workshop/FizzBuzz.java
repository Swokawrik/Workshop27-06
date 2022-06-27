package com.github.swokawrik.workshop;

public class FizzBuzz {
    public static void main(String...args) {
        for (int i = 1; i != 201; i++)
            divided(i);
            //System.out.println("Hello World !");
    }
    public static void divided(int nb) {
        if (nb % 3 == 0 && nb % 5 == 0)
            System.out.println(nb + " -> FizzBuzz");
        else if (nb % 3 == 0)
            System.out.println(nb + " -> Fizz");
        else if (nb % 5 == 0)
            System.out.println(nb + " -> Buzz");
        else
            System.out.println(nb);
    }
}
