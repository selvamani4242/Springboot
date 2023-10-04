package com.example.PersonalDetails.controller;

import com.example.PersonalDetails.dao.PersonDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

@RestController
@RequestMapping("/personDetail")
public class PersonDetailController {

    @Autowired
    PersonDetailService personDetailService;
    
}
