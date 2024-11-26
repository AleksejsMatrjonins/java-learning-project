package lv.acodemy;

public class Practice {
    public static void main(String[] args) {

        // Write a loop that prints numbers from 1 to 10 on separate lines.

        // for (counter, condition, increment) {
        //
        // }

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Using a for loop, print all even numbers from 2 to 20.

        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        // Use a for loop to print the multiplication table of 5 up to 5 * 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " * " + i * 5);
        }

        // 1. Use a loop to calculate the sum of numbers from 1 to 20.

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;}
        System.out.println("the sum of numbers from 1 to 20 is: " + sum);

        // 2. Write a program to print the multiplication table from 1 to 10.

        }
    }

