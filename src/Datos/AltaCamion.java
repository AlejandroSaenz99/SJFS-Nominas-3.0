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
public class AltaCamion {
    private int Id;
    private String Brand;
    private String Model;
private String Owner;
private float Percentage;

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

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public float getPercentage() {
        return Percentage;
    }

    public void setPercentage(float Percentage) {
        this.Percentage = Percentage;
    }

    public AltaCamion(int Id, String Brand, String Model, String Owner, float Percentage) {
        this.Id = Id;
        this.Brand = Brand;
        this.Model = Model;
        this.Owner = Owner;
        this.Percentage = Percentage;
    }

    public AltaCamion() {
    }
}