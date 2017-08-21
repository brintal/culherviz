package at.ac.tuwien.cvast.culherviz.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class AbstractEntity {

    private static final String GENERATOR_NAME = "HIBERNATE_SEQUENCE_GENERATOR";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR_NAME)
    @SequenceGenerator(sequenceName = "hibernate_sequence", name = GENERATOR_NAME, allocationSize = 5)
    @Column(name = "id")
    protected Integer id;

}
