package softuni.gamestore.entity;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String dlc;

    @Column
    private Double price;

    @Column
    private String platform;

    public Game() {
    }

    public Game(String name, String dlc, Double price, String platform) {
        this.name = name;
        this.dlc = dlc;
        this.price = price;
        this.platform = platform;
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

    public String getDlc() {
        return dlc;
    }

    public void setDlc(String dlc) {
        this.dlc = dlc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    //TODO
}
