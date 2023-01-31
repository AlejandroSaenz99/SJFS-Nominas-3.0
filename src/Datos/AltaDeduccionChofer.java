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
public class AltaDeduccionChofer {
             
    private int Id;
    private int Driver_Id;
    private int Period;
    private String Date;
    private String First_Name;
    private String Last_Name;
    private Float Amount;
    private String Description;
    private int Year;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getDriver_Id() {
        return Driver_Id;
    }

    public void setDriver_Id(int Driver_Id) {
        this.Driver_Id = Driver_Id;
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

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
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

    public AltaDeduccionChofer(int Id, int Driver_Id, int Period, String Date, String First_Name, String Last_Name, Float Amount, String Description, int Year) {
        this.Id = Id;
        this.Driver_Id = Driver_Id;
        this.Period = Period;
        this.Date = Date;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Amount = Amount;
        this.Description = Description;
        this.Year = Year;
    }

    public AltaDeduccionChofer() {
    }
}
