package com.unit.testing.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ListOfPerson {

    public static void main(String[] args) {


        String inputDetails = "1,ganesh,ganesh@gmail.com |  2,selva,selva@gmail.com | 3,dinesh,dinesh@gmail.com";

        List<LstOfDetails> lstOfDetails = new ArrayList<>();

        String[] outputSplit = inputDetails.split("|");

        LstOfDetails lstOfDetails1 = new LstOfDetails();

        lstOfDetails1.setNumber(Integer.parseInt(outputSplit[0]));
        lstOfDetails1.setName(outputSplit[1]);
        lstOfDetails1.setEmailid(outputSplit[2]);

        lstOfDetails.add(lstOfDetails1);

        System.out.println(lstOfDetails.get(0));
    }

}