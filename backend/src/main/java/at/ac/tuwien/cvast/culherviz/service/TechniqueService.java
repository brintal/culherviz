package at.ac.tuwien.cvast.culherviz.service;

import at.ac.tuwien.cvast.culherviz.persistence.entity.Technique;

public interface TechniqueService {

    Technique findOrCreateByName(String name);
}
