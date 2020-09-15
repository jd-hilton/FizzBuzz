package com.company;

import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating variables
        List<String> outputList = new ArrayList<>();
        boolean fizzOrBuzz = false;
        boolean bong = false;
        boolean fezz = false;
        String output = "";

        //Asks user for maximum number
        System.out.println("Input Maximum Number:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        //Loops until the maximum number is reached
        for (int i = 1; i <= input; i++) {
            //Resets variables for this iteration
            fizzOrBuzz = false;
            bong = false;

            //Checks for Bong conditions
            if (i % 11 == 0) {
                outputList.add("Bong");
                fizzOrBuzz = true;
                bong = true;
            }

            //Checks to see if bong has been used
            if (!bong) {
                //Checks for Fizz conditions
                if (i % 3 == 0) {
                    outputList.add("Fizz");
                    fizzOrBuzz = true;
                }
                //Checks for Buzz conditions
                if (i % 5 == 0) {
                    outputList.add("Buzz");
                    fizzOrBuzz = true;
                }
                //Checks for Bang conditions
                if (i % 7 == 0) {
                    outputList.add("Bang");
                    fizzOrBuzz = true;
                }
            }

            //Checks for Fezz conditions
            if (i % 13 == 0) {
                fezz = false;
                if (outputList.size() > 0) {
                    //Checks each part of list to find the first B
                    for (int j = 0; j < outputList.size(); j++) {
                        //If B is found insert Fezz in front
                        if (outputList.get(j).charAt(0) == 'B') {
                            outputList.add(j, "Fezz");
                            fezz = true;
                            break;
                        }
                    }
                }
                //If nothing started with B insert Fezz at the end
                if (!fezz) {
                    outputList.add("Fezz");
                }
                fizzOrBuzz = true;
            }

            //Checks if it is a multiple of 17
            if (i % 17 == 0) {
                //Reverses list
                Collections.reverse(outputList);
            }
            //Checks if a word has been inserted
            if (fizzOrBuzz) {
                //Outputs the list
                output = outputList.toString().substring(1).replaceAll(", ", "").replaceAll("]", "");
                System.out.println(output);
            }
            else {
                //If no words were inserted output number
                System.out.println(i);
            }

            //Clears list ready for next iteration
            outputList.clear();
        }
    }
}