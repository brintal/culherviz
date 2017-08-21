package at.ac.tuwien.cvast.culherviz.service;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Person;

public interface PersonService {

    Person getOrCreatePerson(String name, String dnbUrl, String zettelUrl, String wikipediaUrl, String biographienUrl, String musiklexikonUrl);

}
