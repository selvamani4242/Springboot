package com.example.PersonalDetails.repository;

import com.example.PersonalDetails.model.PersonDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personDetailJpaRepository extends JpaRepository<PersonDetail,Long> {

    public PersonDetail findByName(String name);
}
