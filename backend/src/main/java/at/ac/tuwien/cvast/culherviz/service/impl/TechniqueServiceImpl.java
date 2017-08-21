package at.ac.tuwien.cvast.culherviz.service.impl;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Technique;
import at.ac.tuwien.cvast.culherviz.persistence.repo.TechniqueRepository;
import at.ac.tuwien.cvast.culherviz.service.TechniqueService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TechniqueServiceImpl implements TechniqueService {

    @Autowired
    TechniqueRepository techniqueRepository;

    @Override
    public Technique findOrCreateByName(String name) {

        if (StringUtils.isBlank(name))
            return null;

        Technique toRet = techniqueRepository.findByName(name.trim());
        if (toRet != null)
            return toRet;

        Technique newTechnique = new Technique();
        newTechnique.setName(name.trim());
        techniqueRepository.save(newTechnique);
        System.out.println("technique " +newTechnique.getName()+" created");
        return newTechnique;

    }
}
