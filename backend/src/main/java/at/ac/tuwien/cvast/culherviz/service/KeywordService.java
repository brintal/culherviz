package at.ac.tuwien.cvast.culherviz.service;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;

public interface KeywordService {

    void persistAssignedKeyword(Artifact artifact, String keyword);
}
