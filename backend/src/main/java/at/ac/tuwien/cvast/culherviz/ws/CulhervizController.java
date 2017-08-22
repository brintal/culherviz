package at.ac.tuwien.cvast.culherviz.ws;

import at.ac.tuwien.cvast.culherviz.dto.SimpleArtifact;
import at.ac.tuwien.cvast.culherviz.persistence.repo.ArtifactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CulhervizController {

    @Autowired
    ArtifactRepository artifactRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/artifacts")
    public List<SimpleArtifact> artifacts() {
        return artifactRepository.findAllByLocationIsNotNull();
    }
}
