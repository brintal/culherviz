package at.ac.tuwien.cvast.culherviz.persistence.repo;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PersonRepository extends JpaRepository<Person, Integer>, JpaSpecificationExecutor<Person> {


    Person findByName(String name);

    Person findByNameAndDnbUrlAndZettelkatalogUrlAndWikipediaUrlAndBiographienUrlAndMusiklexikonUrl(String name, String dnbUrl, String zettelUrl, String wikipediaUrl, String biographienUrl, String musiklexikonUrl);
}
