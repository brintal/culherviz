package at.ac.tuwien.cvast.culherviz.persistence.repo;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Keyword;
import at.ac.tuwien.cvast.culherviz.persistence.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LocationRepository extends JpaRepository<Location, Integer>, JpaSpecificationExecutor<Location> {


}
