package at.ac.tuwien.cvast.culherviz.persistence.repo;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Technique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TechniqueRepository extends JpaRepository<Technique, Integer>, JpaSpecificationExecutor<Technique> {

    Technique findByName(String name);

}
