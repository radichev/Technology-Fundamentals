package softuni.gamestore.gameBindingModel;

public class GameBindingModel {
    private Integer id;

    private String name;

    private String dlc;

    private Double price;

    private String platform;

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
