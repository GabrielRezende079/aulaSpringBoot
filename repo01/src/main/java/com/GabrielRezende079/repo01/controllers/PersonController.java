package com.GabrielRezende079.repo01.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;
import com.GabrielRezende079.repo01.PersonServices;
import com.GabrielRezende079.repo01.model.Person;



@RestController
@RequestMapping("/person")
public class PersonController {

    
    @Autowired
   private PersonServices sevices;
    // private final PersonServices service = new PersonServices();


    // http://localhost:8080/person
    @RequestMapping(  
    method = RequestMethod.GET, 
    produces = MediaType.APPLICATION_JSON_VALUE) 
    public List<Person> findAll(){
        return sevices.findAll(String.valueOf(Person.class)); //  casting to String to fix the error
        
    }


    // http://localhost:8080/person/{id}
    @RequestMapping( value = "/{id}", 
    method = RequestMethod.GET, 
    produces = MediaType.APPLICATION_JSON_VALUE) 
    public Person findById(@PathVariable("id")String id){
        return sevices.findById(id);
    }
    

}
