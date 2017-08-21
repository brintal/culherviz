package at.ac.tuwien.cvast.culherviz.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class AuthorPK implements Serializable {

    @Column(name = "artifact_id")
    @Id
    private Integer artifactId;

    @Column(name = "person_id")
    @Id
    private Integer personId;

}
