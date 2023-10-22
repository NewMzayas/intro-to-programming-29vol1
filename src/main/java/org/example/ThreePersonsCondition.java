package org.example;

public class ThreePersonsCondition {
    public static void main(String[] args) {
        int age = 55;
        if (age >= 18) {
            System.out.println("If it is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if is it false");
            System.out.println("kid");

        }

        int johnAge = 5;
        if (johnAge >= 18) {
            System.out.println("If it is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if is it false");
            System.out.println("kid");
        }

        int marthaAge = 19;
        if (marthaAge >= 18) {
            System.out.println("If it is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if is it false");
            System.out.println("kid");
        }
    }
}