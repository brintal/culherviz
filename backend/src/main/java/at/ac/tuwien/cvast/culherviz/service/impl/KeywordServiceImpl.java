package at.ac.tuwien.cvast.culherviz.service.impl;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Artifact;
import at.ac.tuwien.cvast.culherviz.persistence.entity.Keyword;
import at.ac.tuwien.cvast.culherviz.persistence.repo.KeywordRepository;
import at.ac.tuwien.cvast.culherviz.service.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Component
public class KeywordServiceImpl implements KeywordService {


    @Autowired
    KeywordRepository keywordRepository;

    @Transactional
    @Override
    public void persistAssignedKeyword(Artifact artifact, String keyword) {

        Keyword keywordObject = keywordRepository.findByValue(keyword);

        if (keywordObject.getArtifacts() == null) {
            keywordObject.setArtifacts(new ArrayList<>());
        }
        keywordObject.getArtifacts().add(artifact);

        keywordRepository.save(keywordObject);

    }
}
