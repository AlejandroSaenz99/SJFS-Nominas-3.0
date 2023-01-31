/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Metodos.Metodos_Altas;
import java.util.Date;

/**
 *
 * @author AlejandroSaenz
 */
public class AltaDeduccion {
           
    private int Id;
    private int Truck_Id;
    private int Period;
    private String Date;
    private String Owner;
    private String Truck;
    private Float Amount;
    private String Description;
    private int Year;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTruck_Id() {
        return Truck_Id;
    }

    public void setTruck_Id(int Truck_Id) {
        this.Truck_Id = Truck_Id;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getTruck() {
        return Truck;
    }

    public void setTruck(String Truck) {
        this.Truck = Truck;
    }

    public Float getAmount() {
        return Amount;
    }

    public void setAmount(Float Amount) {
        this.Amount = Amount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public AltaDeduccion(int Id, int Truck_Id, int Period, String Date, String Owner, String Truck, Float Amount, String Description, int Year) {
        this.Id = Id;
        this.Truck_Id = Truck_Id;
        this.Period = Period;
        this.Date = Date;
        this.Owner = Owner;
        this.Truck = Truck;
        this.Amount = Amount;
        this.Description = Description;
        this.Year = Year;
    }

    public AltaDeduccion() {
    }
}