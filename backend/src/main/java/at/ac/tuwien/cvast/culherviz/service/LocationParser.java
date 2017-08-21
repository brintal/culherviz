package at.ac.tuwien.cvast.culherviz.service;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;
import at.ac.tuwien.cvast.culherviz.persistence.entity.Location;
import at.ac.tuwien.cvast.culherviz.service.impl.LocationParserImpl;
import org.springframework.transaction.annotation.Transactional;

public interface LocationParser {

    void parseAllLocations();

    @Transactional
    Location parseLocationForArtifact(Artifact artifact) throws LocationParserImpl.NoResultsException;
}
