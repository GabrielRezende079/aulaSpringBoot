package com.GabrielRezende079.repo01.Services;

import org.springframework.stereotype.Service;


import com.GabrielRezende079.repo01.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;


@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());


    // Find all persons
    public List<Person> findAll(String id){
        logger.info("Finding all people!");
       List <Person> persons = new ArrayList<Person>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);         
        }
        return persons;
    }
    
    // Find person by id
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


    // Create person
     public Person createPerson(Person person){
        logger.info("Creating one person!");
        return (Person) person;
     }

    // Update person
    public Person updatingPerson(Person person){
        logger.info("Updating one person!");
        return (Person) person;
     }

     // Delete person
    public void DeletingPerson(String id){
        logger.info("Deleting one person!");
     }



    // Mock person data for testing
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName" + i);
        person.setLastName("LastName" + i);
        person.setAddress("Some Address in Brazil" + i);
        person.setGender("Male");
        return person;
    
    }
}
