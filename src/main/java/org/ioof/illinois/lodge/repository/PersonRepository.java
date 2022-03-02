package org.ioof.illinois.lodge.repository;
import org.springframework.data.repository.CrudRepository;
import org.ioof.illinois.lodge.model.Person;
public interface PersonRepository extends CrudRepository<Person, Integer>
{
}
