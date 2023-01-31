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
public class AltaEstado {
    private String Owner;
    private String Truck;
    private int Year;
    private int Period;
    private String Status;

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

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AltaEstado() {
    }

    public AltaEstado(String Owner, String Truck, int Year, int Period, String Status) {
        this.Owner = Owner;
        this.Truck = Truck;
        this.Year = Year;
        this.Period = Period;
        this.Status = Status;
    }
}
