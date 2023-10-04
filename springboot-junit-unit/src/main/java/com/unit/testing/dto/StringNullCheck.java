package com.unit.testing.dto;
public class StringNullCheck {
    public String checkingNull(String input){

        if (input == null){

            return "selva";
        }
            return "not null";
    }

    public String checkingNullExcepting(String input){

        try{
            input.equals(null);
            return "dinesh";
        }catch (NullPointerException e){
            return "selva";
        }
    }

}


