package com.unit.testing.controller;

import com.unit.testing.dto.Grocery;
import com.unit.testing.dto.PersonDetails;
import com.unit.testing.dto.PersonResponse;
import com.unit.testing.pojo.PersonDetailsPojo;
import com.unit.testing.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery/item")
public class GroceryController {


    @Autowired
    GroceryService groceryService;

    @GetMapping("/all")
    public ResponseEntity<Grocery> getItems() {
        Grocery grocery = groceryService.allItems();
        return ResponseEntity.ok(grocery);
    }

    @GetMapping("/getTypes/{type}")
    public ResponseEntity<Grocery> getType(@PathVariable String type) {
        Grocery grocery = groceryService.getTypes(type);
        return ResponseEntity.ok(grocery);
    }

    @PostMapping("sendPersonDetail")
    public ResponseEntity<PersonDetails> save(@RequestBody PersonDetailsPojo personDetailsPojo) {
        PersonDetails personDetails = groceryService.insertPersonDetail(personDetailsPojo);
        return ResponseEntity.status(HttpStatus.CREATED).body(personDetails);
    }

    @GetMapping("showAllPersonDetail")
    public ResponseEntity<PersonResponse> getDetail() {

        PersonResponse personResponse = groceryService.getPersonaDetailInfo();

        return ResponseEntity.status(HttpStatus.OK).body(personResponse);

    }

}
