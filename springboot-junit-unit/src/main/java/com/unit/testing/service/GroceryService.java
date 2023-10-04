package com.unit.testing.service;

import com.unit.testing.dao.GroceryDaoService;
import com.unit.testing.dto.Grocery;
import com.unit.testing.dto.Item;
import com.unit.testing.dto.PersonDetails;
import com.unit.testing.dto.PersonResponse;
import com.unit.testing.pojo.PersonDetailsPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroceryService {
    @Autowired
    GroceryDaoService groceryDaoService;

    public Grocery allItems(){
        List<Item> itemList = groceryDaoService.callService();
        Grocery grocery = new Grocery();
        grocery.setItemList(itemList);
        return grocery;
    }
    public Grocery getTypes(String type){
       List<Item> items = groceryDaoService.typeService(type);
       Grocery grocery = new Grocery();
       grocery.setItemList(items);
       return grocery;
    }

    public PersonDetails insertPersonDetail(PersonDetailsPojo personDetailsPojo){

        PersonDetails personDetails1 = new PersonDetails();
        personDetails1.setPersonid(personDetails1.getPersonid());
        personDetails1.setName(personDetails1.getName());
        personDetails1.setPrice(personDetails1.getPrice());
        personDetails1.setDate(personDetails1.getDate());

        PersonDetails personDetails2 =  groceryDaoService.sendPersonDetail(personDetailsPojo);
        return personDetails2;

    }

    public PersonResponse getPersonaDetailInfo() {

        PersonResponse personResponse = groceryDaoService.getPersonDetails();

        return personResponse;


    }
}
