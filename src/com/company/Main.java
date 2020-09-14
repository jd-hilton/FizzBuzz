package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> outputList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                outputList.add("Fizz");
            }
            if (i % 5 == 0) {
                outputList.add("Buzz");
            }
            if (i % 7 == 0) {
                outputList.add("Bang");
            }
            else {
                System.out.println(i);
            }
            System.out.println(outputList);
        }
        /*for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBang");
            }
            else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBang");
            }
            else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("BuzzBang");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 7 == 0) {
                System.out.println("Bang");
            }
            else {
                System.out.println(i);
            }
        }*/
    }
}
