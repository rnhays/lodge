package org.ioof.illinois.lodge.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ioof.illinois.lodge.model.Person;
import org.ioof.illinois.lodge.repository.PersonRepository;
//defining the business logic
@Service
public class PersonService 
{
@Autowired
PersonRepository personRepository;
//getting all Person records
public List<Person> getAllPerson() 
{
List<Person> persons = new ArrayList<Person>();
personRepository.findAll().forEach(person -> persons.add(person));
return persons;
}
//getting a specific record
public Person getPersonById(int id) 
{
return personRepository.findById(id).get();
}
public void saveOrUpdate(Person person) 
{
personRepository.save(person);
}
//deleting a specific record
public void delete(int id) 
{
personRepository.deleteById(id);
}
}