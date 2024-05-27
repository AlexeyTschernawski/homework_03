package app.repository;

import app.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository implements PersonRepositoryList{

    private List<Person> people;

    public PersonRepository() {
        people = new ArrayList<>();

        people.add(new Person(15021968, "Alex Mayer", "Bahnstr. 10, 40256 Hamburg","ABT158"));
        people.add(new Person(14081985, "Bob", "456 Oak Avenue", "INS654321"));
        people.add(new Person(20031995, "Charlie", "789 Pine Road", "INS789012"));
        people.add(new Person(11122000, "Diana", "101 Birch Boulevard", "INS345678"));
        people.add(new Person(12091980, "Edward", "202 Cedar Lane", "INS567890"));
    }


    @Override
    public Person getByBorn(Integer born) {
        return people.get(born);
    }


}
