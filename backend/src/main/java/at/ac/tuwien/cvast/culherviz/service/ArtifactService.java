package at.ac.tuwien.cvast.culherviz.service;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;

import java.util.List;

public interface ArtifactService {

    void updateKeywordsForArtifact(Integer id, List<String> keywords);
}
