package at.ac.tuwien.cvast.culherviz.persistence.repo;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ArtifactRepository extends JpaRepository<Artifact, Integer>, JpaSpecificationExecutor<Artifact> {

    @Query("select a.id from Artifact a")
    List<Integer> findAllIds();

    @Query("select a.onbImageId from Artifact a")
    List<Integer> findAllOnbImageIds();

    @Query("select a from Artifact a where a.location is null and a.locationLastUpdated is null")
    List<Artifact> findAllWithoutLocation();


}
