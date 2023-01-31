/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author AlejandroSaenz
 */
public class AltaTrailer {
    private int Id;
    private String Brand;
    private String Model;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public AltaTrailer(int Id, String Brand, String Model) {
        this.Id = Id;
        this.Brand = Brand;
        this.Model = Model;
    }

    public AltaTrailer() {
    }

}
