package app.controller;

import app.domain.Person;
import app.service.PersonService;
import org.springframework.stereotype.Component;

@Component
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    public Person getByBorn(Integer born) {
        return service.getByBorn(born);
    }
}
