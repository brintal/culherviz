package at.ac.tuwien.cvast.culherviz.service.impl;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;
import at.ac.tuwien.cvast.culherviz.persistence.entity.Keyword;
import at.ac.tuwien.cvast.culherviz.persistence.repo.ArtifactRepository;
import at.ac.tuwien.cvast.culherviz.persistence.repo.KeywordRepository;
import at.ac.tuwien.cvast.culherviz.service.ArtifactService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArtifactServiceImpl implements ArtifactService {


    @Autowired
    ArtifactRepository artifactRepository;

    @Autowired
    KeywordRepository keywordRepository;

    @Transactional
    @Override
    public void updateKeywordsForArtifact(Integer id, List<String> keywords) {
        Artifact artifact = artifactRepository.findById(id).get();

        List<Keyword> keywordList = new ArrayList<>();

        for (String keyword : keywords) {
            keywordList.add(keywordRepository.findByValue(keyword));
        }

        artifact.setKeywords(keywordList);
        artifactRepository.save(artifact);
    }
}
