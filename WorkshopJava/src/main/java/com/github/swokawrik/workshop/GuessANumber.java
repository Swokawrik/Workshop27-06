package com.github.swokawrik.workshop;

import java.util.*;

public class GuessANumber {
    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int realRand = 0;
        if (args.length == 0)
            realRand = rand.nextInt(100) + 1;
        else if (args.length == 2)
            realRand = rand.nextInt(Integer.parseInt(args[1]) + Integer.parseInt(args[0]));
        else {
            System.out.println("Wrong number of args");
            System.exit(84);
        }
        int input = 0;
        int tries = 0;
        while (true) {
            System.out.print("Your guess? ");
            input = scan.nextInt();
            if (input > realRand)
                System.out.println("Too high!");
            else if (input < realRand)
                System.out.println("Too low!");
            else if (input == realRand) {
                System.out.println("You win!\nIt took you " + tries + " tries.");
                break;
            }
            tries++;
            System.out.println(realRand);
        }
        //System.out.println("Hello World !");
    }
}
