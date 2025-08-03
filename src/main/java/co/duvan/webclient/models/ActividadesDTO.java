package co.duvan.webclient.models;

public class ActividadesDTO {

    //* Vars
    private String description;

    //* Constructors
    public ActividadesDTO() {
    }

    public ActividadesDTO(String description) {
        this.description = description;
    }

    //* Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
