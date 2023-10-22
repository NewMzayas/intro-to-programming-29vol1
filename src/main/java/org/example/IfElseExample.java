package org.example;

public class IfElseExample {

    public static void main(String[] args) {
        System.out.println("Let's make a decision. Are you an adult or a kid?");

        // if I am an adult print "I'm an adult"
        // otherwise print "Just a kid"
        int age = 20;
        if (age >= 18) {
            System.out.println("I'm an adult");
        }

        if (age < 18) {
            System.out.println("Just a kid.");
        }
        // code block marked with pair of curly brackets is like one instruction
        if (age >= 18) {
            System.out.println("If it is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if is it false");
            System.out.println("kid");

        }

        System.out.println("Always printed");
    }
}
