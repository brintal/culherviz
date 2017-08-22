package at.ac.tuwien.cvast.culherviz;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;
import at.ac.tuwien.cvast.culherviz.persistence.entity.Location;
import at.ac.tuwien.cvast.culherviz.persistence.repo.ArtifactRepository;
import at.ac.tuwien.cvast.culherviz.service.LocationParser;
import at.ac.tuwien.cvast.culherviz.service.impl.LocationParserImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationParserTests {


    @Autowired
    LocationParser locationParser;

    @Autowired
    ArtifactRepository artifactRepository;

    @Test
    public void contextLoads() {
//        int count = 1;
//        for (Artifact artifact : artifactRepository.findAllWithoutLocation()) {
//            Location location = null;
//            try {
//                location = locationParser.parseLocationForArtifact(artifact);
//                if (location != null) {
//                    artifact.setLocation(location);
//                    artifact.setLocationLastUpdated(new Date());
//                    artifactRepository.save(artifact);
//                }
//
//            } catch (LocationParserImpl.NoResultsException e) {
//                artifact.setLocationLastUpdated(new Date());
//                artifactRepository.save(artifact);
//                System.out.println("no results");
//            }
//            System.out.println(count++ + " | " + artifact.getOnbImageId());
//        }
    }

}
