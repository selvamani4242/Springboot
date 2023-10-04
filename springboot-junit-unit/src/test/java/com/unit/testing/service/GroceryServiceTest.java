package com.unit.testing.service;

import com.unit.testing.dao.GroceryDaoService;
import com.unit.testing.dto.Grocery;
import com.unit.testing.dto.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GroceryServiceTest {

    @Mock
    GroceryDaoService groceryDaoService;

    @InjectMocks
    GroceryService groceryService = new GroceryService();

    @Test
    public void test_allItems(){
        List<Item> itemList = new ArrayList<>();
        when(groceryDaoService.callService()).thenReturn(itemList);
        Grocery grocery = groceryService.allItems();
        assert grocery.getItemList().size() == 0;
    }

    @Test
    public void test_Types(){

        Grocery grocery = new Grocery();
        ArrayList<Item> items = new ArrayList<Item>();
        Item item = new Item();
        item.setType("meat");
        item.setImage("logo");
        item.setPrice(11.6);
        item.setName("chicken");
        items.add(item);
        grocery.setItemList(items);
        when(groceryDaoService.typeService(String.valueOf(String.class))).thenReturn(items);
        Grocery groceryresponse = groceryService.getTypes("meat");
        assert groceryresponse.getItemList().size() == 0;
    }

    
}