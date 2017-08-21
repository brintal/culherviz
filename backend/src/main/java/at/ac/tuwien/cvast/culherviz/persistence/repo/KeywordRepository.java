package at.ac.tuwien.cvast.culherviz.persistence.repo;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;
import at.ac.tuwien.cvast.culherviz.persistence.entity.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface KeywordRepository extends JpaRepository<Keyword, Integer>, JpaSpecificationExecutor<Keyword> {

        Keyword findByValue(String value);

}
