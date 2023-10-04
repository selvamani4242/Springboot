package com.unit.testing.exception;

public class CustomException {

    public static void main(String[] args) {
        try {

            throw new MyCheckedException("This is a checked exception.");
        } catch (MyCheckedException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        throw new MyUncheckedException("This is an unchecked exception.");
    }
}
