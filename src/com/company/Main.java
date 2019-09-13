package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array lenght: ");
        int number = scanner.nextInt();
        int[] nums = new int[number];
        System.out.println("Insert array elements: ");
        try {

            for (int i = 0; i < number; i++) {
                nums[i] = scanner.nextInt();

            }


        } catch (InputMismatchException e) {
            System.out.println("You can`t input letter!");

        }
        System.out.println("Your array is full!");

    }
}
