package com.unit.testing.dto;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversion {

    int number;
    String name;
    String emailid;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public static void main(String[] args)  {

        String input = "1,ganesh,ganesh@gmail.com";

          String[] splitOutput = input.split(",");

        //  System.out.println(splitOutput[0] + splitOutput[1] +splitOutput[2]);

          Conversion conversion = new Conversion();
          conversion.setNumber(Integer.parseInt(splitOutput[0]));
          conversion.setName(splitOutput[1]);
          conversion.setEmailid(splitOutput[2]);
          System.out.println(conversion.getNumber()+conversion.getName()+conversion.getEmailid());

    }

}
