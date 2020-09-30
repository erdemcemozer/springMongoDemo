package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    public Person findByFirstName(String firstName);
    public Person findByLastName(String LastName);
    public List<Person> findByAge(int age);
}
