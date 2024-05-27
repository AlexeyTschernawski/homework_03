package app.repository;

import app.domain.Person;

public interface PersonRepositoryList {

    Person getByBorn (Integer born);
}
