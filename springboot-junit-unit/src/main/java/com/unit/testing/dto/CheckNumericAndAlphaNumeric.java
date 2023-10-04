package com.unit.testing.dto;

import java.util.ArrayList;
import java.util.List;

public class CheckNumericAndAlphaNumeric {

//    public static void main(String[] args)
//    {
//        String s = "ABC";
//        System.out.println("IsAlphaNumeric: " + isAlphaNumeric(s));

        public static void main(String[] args) {

            List<String> strings = new ArrayList<>();
            strings.add("123");
            strings.add("abc");
            strings.add("456def");
            strings.add("789");

            boolean allNumeric = true;
            boolean allAlphaNumeric = true;

            for (String str : strings) {
                if (!isNumeric(str)) {
                    allNumeric = false;
                }
                if (!isAlphaNumeric(str)) {
                    allAlphaNumeric = false;
                }
            }

            if (allNumeric) {
                System.out.println("All strings in the list are numeric.");
            } else {
                System.out.println("Not all strings in the list are numeric.");
            }

            if (allAlphaNumeric) {
                System.out.println("All strings in the list are alphanumeric.");
            } else {
                System.out.println("Not all strings in the list are alphanumeric.");
            }
        }

        public static boolean isNumeric(String str) {
            return str.matches("\\d+");
        }

        public static boolean isAlphaNumeric(String str) {
            return str.matches("[a-zA-Z0-9]+");
        }
    }

