package com.unit.testing.dto;

import java.util.List;

public class PersonResponse {

    List<PersonDetails> personDetails;
    boolean status;
    String errormessage;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public List<PersonDetails> getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(List<PersonDetails> personDetails) {
        this.personDetails = personDetails;
    }




}
