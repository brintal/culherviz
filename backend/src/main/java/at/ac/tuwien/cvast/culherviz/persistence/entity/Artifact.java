package at.ac.tuwien.cvast.culherviz.persistence.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@Entity
@ToString(exclude = {"authors", "motifs", "keywords", "location", "technique"})
public class Artifact extends AbstractEntity {

    @Column(name = "onb_image_id")
    private Integer onbImageId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "corporate_body")
    private String corporateBody;

    @Column(name = "year")
    private Integer year;

    @Column(name = "place")
    private String place;

    @Column(name = "address")
    private String address;

    @Column(name = "inventory_number")
    private String inventoryNumber;

    @Column(name = "picture_credits")
    private String pictureCredits;

    @Column(name = "digital_collection")
    private String digitalCollection;

    @Column(name = "additional_title")
    private String additionalTitle;

    @Column(name = "district")
    private Integer district;

    @Column(name = "date_text")
    private String dateText;

    @Column(name = "location_last_updated")
    private Date locationLastUpdated;

    @ManyToOne
    @JoinColumn(name = "technique_id")
    private Technique technique;

    @ManyToMany
    @JoinTable(name = "author", catalog = "culherviz", schema = "public", joinColumns = @JoinColumn(name = "artifact_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false))
    private List<Person> authors;

    @ManyToMany
    @JoinTable(name = "motif", catalog = "culherviz", schema = "public", joinColumns = @JoinColumn(name = "artifact_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false))
    private List<Person> motifs;

    @ManyToMany
    @JoinTable(name = "assigned_keyword", catalog = "culherviz", schema = "public", joinColumns = @JoinColumn(name = "artifact_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "keyword_id", referencedColumnName = "id", nullable = false))
    private List<Keyword> keywords;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;



}
