package softuni.bandregister.entities;

import javax.persistence.*;


@Entity
@Table(name = "bands")
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String members;

    @Column
    private Double honorarium;

    @Column
    private String genre;

    public Band() {
    }

    public Band(String name, String members, Double honorarium, String genre) {
        this.name = name;
        this.members = members;
        this.honorarium = honorarium;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public Double getHonorarium() {
        return honorarium;
    }

    public void setHonorarium(Double honorarium) {
        this.honorarium = honorarium;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    //TODO
}
