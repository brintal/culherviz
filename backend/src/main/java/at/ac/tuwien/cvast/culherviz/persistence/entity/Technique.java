package at.ac.tuwien.cvast.culherviz.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Technique extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "technique")
    private List<Artifact> artifacts;

}
