package com.example.PersonalDetails.dao;

import com.example.PersonalDetails.model.PersonDetail;
import com.example.PersonalDetails.repository.personDetailJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonDetailService implements IPersonDetail{


    @Autowired
    personDetailJpaRepository personDetailJpaRepository;


    @Override
    public PersonDetail findByName(String name) {
     PersonDetail personDetail  = personDetailJpaRepository.findByName(name);
     return personDetail;
    }

    @Override
    public PersonDetail insertRecord(PersonDetail personDetail) {

        PersonDetail personDetail1 = new PersonDetail();
        personDetail1.setDate(personDetail.getDate());
        personDetail1.setName(personDetail.getName());
        personDetail1.setPrice(personDetail.getPrice());

        PersonDetail personDetail2 = personDetailJpaRepository.save(personDetail1);
        return  personDetail2;

    }
}
