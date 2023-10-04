package com.unit.testing.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckAlphaNumeric {

    public static void main(String[] args) {

        DataTypeConversion dataTypeConversion = new DataTypeConversion();

        List<String> input = new ArrayList<>();
        input.add("123");
        input.add("abc");
        input.add("456def");
        input.add("789");

    //  List<String> collectOutput = input.stream().filter(a -> a.matches(".*[a-zA-Z0-9].*")).collect(Collectors.toList());

    //  List<String> collectOutput = input.stream().filter(a -> a.matches(".*[0-9].*")).collect(Collectors.toList());
    //  System.out.println(collectOutput);

        List<String> ouput = input.stream().filter(dataTypeConversion::checkNumeric).collect(Collectors.toList());
        System.out.println(ouput);

    }

}
