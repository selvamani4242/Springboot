package com.unit.testing.dto;

public class CheckNumeric {

    public static void main(String[] args) {

        String input = "Hello123";

        boolean containsAlphanumeric = input.matches(".*[a-zA-Z0-9].*");

        if (containsAlphanumeric) {
            System.out.println("The string contains alphanumeric characters.");
        } else {
            System.out.println("The string does not contain alphanumeric characters.");
        }
    }

}



