package com.unit.testing.dao;

import com.unit.testing.dto.Item;
import com.unit.testing.dto.PersonDetails;
import com.unit.testing.dto.PersonResponse;
import com.unit.testing.pojo.PersonDetailsPojo;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroceryDaoService {


    public List<Item> callService(){
        RestTemplate restTemplateConnect = new RestTemplate();
        ResponseEntity<Item[]> response = restTemplateConnect.getForEntity("https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json", Item[].class);
        List<Item> itemList = Arrays.asList(response.getBody());
        return  itemList;
    }

    public List<Item> typeService(String type){

        RestTemplate restTemplate= new RestTemplate();
        ResponseEntity<Item[]> reponsetype = restTemplate.getForEntity("https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json",Item[].class);
        List<Item> itemList = Arrays.asList(reponsetype.getBody());
        List<Item> typelist = itemList.stream().filter(a -> a.getType().contains(type)).collect(Collectors.toList());
        return typelist;
    }

    public PersonDetails sendPersonDetail(PersonDetailsPojo personDetailsPojo) {

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<PersonDetailsPojo> personDetailsPojoHttpEntity = new HttpEntity<>(personDetailsPojo);

        ResponseEntity <PersonDetails> persondetailsresponse = restTemplate.postForEntity("http://localhost:8082/personDetails/InsertRecord", personDetailsPojoHttpEntity, PersonDetails.class);

        PersonDetails personDetails =  persondetailsresponse.getBody();

        return personDetails;

    }

    public  PersonResponse getPersonDetails()  {

        try {

            PersonResponse personResponse = new PersonResponse();

            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<PersonDetails[]> responsepersondetail = restTemplate.getForEntity("http://localhost:8082/personDetails/Showall", PersonDetails[].class);

            List<PersonDetails> personDetailsList = Arrays.asList(responsepersondetail.getBody());

            personResponse.setPersonDetails(personDetailsList);
            personResponse.setStatus(true);


//        if (responsepersondetail.getStatusCode() == HttpStatus.ACCEPTED){
//
//            return List.of(responsepersondetail.getBody());
//        }
//
//        else {
//
//            return "No data Found" + responsepersondetail.getStatusCode();
//        }

            return personResponse;

        } catch (Exception e) {
            PersonResponse response = new PersonResponse();
            response.setStatus(false);
            response.setErrormessage(e.getMessage());
            e.printStackTrace();
            return response;

        }
    }
}
