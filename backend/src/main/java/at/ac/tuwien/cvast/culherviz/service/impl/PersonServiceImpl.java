package at.ac.tuwien.cvast.culherviz.service.impl;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Person;
import at.ac.tuwien.cvast.culherviz.persistence.repo.PersonRepository;
import at.ac.tuwien.cvast.culherviz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {


    @Autowired
    PersonRepository personRepository;

    @Override
    public Person getOrCreatePerson(String name, String dnbUrl, String zettelUrl, String wikipediaUrl, String biographienUrl, String musiklexikonUrl) {

        Person existingPerson = personRepository.findByNameAndDnbUrlAndZettelkatalogUrlAndWikipediaUrlAndBiographienUrlAndMusiklexikonUrl(name, dnbUrl, zettelUrl, wikipediaUrl, biographienUrl, musiklexikonUrl);

        if (existingPerson != null) {

            return existingPerson;

        } else {
            Person newPerson = new Person();
            newPerson.setName(name);
            newPerson.setDnbUrl(dnbUrl);
            newPerson.setZettelkatalogUrl(zettelUrl);
            newPerson.setWikipediaUrl(wikipediaUrl);
            newPerson.setBiographienUrl(biographienUrl);
            newPerson.setMusiklexikonUrl(musiklexikonUrl);
            System.out.println("new person: " + newPerson);
            return personRepository.save(newPerson);
        }

    }
}
