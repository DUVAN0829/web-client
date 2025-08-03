package co.duvan.webclient.models;

import java.util.Date;
import java.util.List;

public class UserDTO {

    //* Vars
    private String name;
    private Date createAt;
    private List<ActividadesDTO> actividades;

    //* Constructor
    public UserDTO() {
    }

    public UserDTO(String name, Date createAt, List<ActividadesDTO> actividades) {
        this.name = name;
        this.createAt = createAt;
        this.actividades = actividades;
    }

    //* Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<ActividadesDTO> getActividades() {
        return actividades;
    }

    public void setActividades(List<ActividadesDTO> actividades) {
        this.actividades = actividades;
    }

}
