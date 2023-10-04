package com.unit.testing.controller;

import com.unit.testing.dao.GroceryDaoService;
import com.unit.testing.dto.Grocery;
import com.unit.testing.dto.Item;
import com.unit.testing.service.GroceryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GroceryControllerTest {

    @Mock
    GroceryService groceryService;

    @InjectMocks
    GroceryController groceryController = new GroceryController();

    @Test
    public void test_allItems(){
        Grocery grocery = new Grocery();
        grocery.setItemList(new ArrayList<>());
        when(groceryService.allItems()).thenReturn(grocery);
        ResponseEntity<Grocery> groceries = groceryController.getItems();
        assert groceries.getBody().getItemList().size() == 0;
    }

    @Test
    public void test_types(){
        Grocery grocery = new Grocery();
        ArrayList<Item> items = new ArrayList<Item>();
        Item item = new Item();
        item.setType("meat");
        item.setImage("logo");
        item.setPrice(11.6);
        item.setName("chicken");
        items.add(item);
        grocery.setItemList(items);
        when(groceryService.getTypes(String.valueOf(String.class))).thenReturn(grocery);
        ResponseEntity<Grocery> groceriesresponse = groceryController.getType("meat");
  //      assert groceriesresponse.getBody().getItemList().size() == 0;

    }

}