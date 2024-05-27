package app.service;

import app.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import app.repository.PersonRepository;

@Service
@PropertySource("classpath:application.properties")
public class PersonServiceImpl implements PersonService{


    private PersonRepository repository;
    private String numberPrefix;

    public PersonServiceImpl(
            PersonRepository repository,
            @Value("${number.prefix}") String numberPrefix
            ) {
        this.repository = repository;
        this.numberPrefix = numberPrefix;
    }

    @Override
    public Person getByBorn(Integer born) {
        Person person = repository.getByBorn(born);
        setInsuranceNumber(person);
        return person;
    }

    private void setInsuranceNumber (Person person) {
        String insuranceNumber = String.format("%s.%s.%s", numberPrefix, person.getName().charAt(2), person.getBorn(1));
        person.setInsuranceNumber(insuranceNumber);

    }
}
