package com.unit.testing.dto;
public class CheckStringNullorEmpty {

    public boolean checkingString() {

        String inputString = "Selvamani";

        inputString.trim();  

        if (inputString == null || inputString.length() == 0) {

            return true;
        }
            return false;
    }

}
