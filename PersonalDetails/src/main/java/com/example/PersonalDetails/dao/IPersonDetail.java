package com.example.PersonalDetails.dao;

import com.example.PersonalDetails.model.PersonDetail;
import org.springframework.stereotype.Component;

@Component
public interface IPersonDetail {


    public PersonDetail findByName(String name);

    public PersonDetail insertRecord(PersonDetail personDetail);
}
