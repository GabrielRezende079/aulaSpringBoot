package com.GabrielRezende079.repo01;

import org.springframework.stereotype.Service;
import com.GabrielRezende079.repo01.model.Person;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;


@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
    logger.info("Finding one person!");
        
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Gabriel");
        person.setLastName("Rezende");
        person.setAddress("Brazil");
        person.setGender("Male");
        return person;
    }



}
