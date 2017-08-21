package at.ac.tuwien.cvast.culherviz.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Location extends AbstractEntity {

    @Column(name = "lat")
    private Double latitude;

    @Column(name = "lng")
    private Double longitude;

    @Column(name = "formatted_address")
    private String formattedAddress;

    @OneToOne(mappedBy = "location")
    private Artifact artifact;

}
