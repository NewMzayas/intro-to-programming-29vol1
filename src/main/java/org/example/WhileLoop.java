package org.example;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("While loop");

        // while (booleanCondition( {}
        // increment operator
        // ++
        int number = 1;
        number = number + 1;
        number++; // the same as number = number +1;
        System.out.println("Number: " + number);

        // decrement operator
        // --
        number --; // the same as number = number - 1;

        // if condition is true, just repeat;
        while (number >0) {
            System.out.println("Current value of the number: " + number);
            number--;
        }
        System.out.println("After the loop");
        System.out.println("Current value of the number is: " + number);

        while (number > 0) {
            System.out.println("Nothing ......");
        }
        javaForever();
    }
    public static void javaForever() {
        while (true) {
            System.out.println("Java forever");
        }
    }
}
