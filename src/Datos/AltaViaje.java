/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author AlejandroSaenz
 */
public class AltaViaje {
    private int Id;
    private int Period;
    private int No_Trip;
    private Date Date;
    private int Id_Driver;
    private String First_Name;
    private String Last_Name;
    private String Ticket;
    private String BOL;
    private String Truck;
    private String Trailer;
    private Float Weight; 
    private Float Cost_of_the_trip;
    private String Description_of_the_cost;
    private Float Amount;
    private Float Driver_Pay;
   
    private int Year;
    private String Type;
    private String Added_By;
    private String Miles;
    private String Owner;
    private Float Bonus;
    private String Bonus_Details;
    private String Ticket_Percentage;
    private Float SJFS_Percentage;
    private Float S_J_F_S;
    private Float Bonus_Driver;
    private String Details_Bonus_Driver;

    public AltaViaje() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    public int getNo_Trip() {
        return No_Trip;
    }

    public void setNo_Trip(int No_Trip) {
        this.No_Trip = No_Trip;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getId_Driver() {
        return Id_Driver;
    }

    public void setId_Driver(int Id_Driver) {
        this.Id_Driver = Id_Driver;
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

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    public String getBOL() {
        return BOL;
    }

    public void setBOL(String BOL) {
        this.BOL = BOL;
    }

    public String getTruck() {
        return Truck;
    }

    public void setTruck(String Truck) {
        this.Truck = Truck;
    }

    public String getTrailer() {
        return Trailer;
    }

    public void setTrailer(String Trailer) {
        this.Trailer = Trailer;
    }

    public Float getWeight() {
        return Weight;
    }

    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    public Float getCost_of_the_trip() {
        return Cost_of_the_trip;
    }

    public void setCost_of_the_trip(Float Cost_of_the_trip) {
        this.Cost_of_the_trip = Cost_of_the_trip;
    }

    public String getDescription_of_the_cost() {
        return Description_of_the_cost;
    }

    public void setDescription_of_the_cost(String Description_of_the_cost) {
        this.Description_of_the_cost = Description_of_the_cost;
    }

    public Float getAmount() {
        return Amount;
    }

    public void setAmount(Float Amount) {
        this.Amount = Amount;
    }

    public Float getDriver_Pay() {
        return Driver_Pay;
    }

    public void setDriver_Pay(Float Driver_Pay) {
        this.Driver_Pay = Driver_Pay;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getAdded_By() {
        return Added_By;
    }

    public void setAdded_By(String Added_By) {
        this.Added_By = Added_By;
    }

    public String getMiles() {
        return Miles;
    }

    public void setMiles(String Miles) {
        this.Miles = Miles;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public Float getBonus() {
        return Bonus;
    }

    public void setBonus(Float Bonus) {
        this.Bonus = Bonus;
    }

    public String getBonus_Details() {
        return Bonus_Details;
    }

    public void setBonus_Details(String Bonus_Details) {
        this.Bonus_Details = Bonus_Details;
    }

    public String getTicket_Percentage() {
        return Ticket_Percentage;
    }

    public void setTicket_Percentage(String Ticket_Percentage) {
        this.Ticket_Percentage = Ticket_Percentage;
    }

    public Float getSJFS_Percentage() {
        return SJFS_Percentage;
    }

    public void setSJFS_Percentage(Float SJFS_Percentage) {
        this.SJFS_Percentage = SJFS_Percentage;
    }

    public Float getS_J_F_S() {
        return S_J_F_S;
    }

    public void setS_J_F_S(Float S_J_F_S) {
        this.S_J_F_S = S_J_F_S;
    }

    public Float getBonus_Driver() {
        return Bonus_Driver;
    }

    public void setBonus_Driver(Float Bonus_Driver) {
        this.Bonus_Driver = Bonus_Driver;
    }

    public String getDetails_Bonus_Driver() {
        return Details_Bonus_Driver;
    }

    public void setDetails_Bonus_Driver(String Details_Bonus_Driver) {
        this.Details_Bonus_Driver = Details_Bonus_Driver;
    }

    public AltaViaje(int Id, int Period, int No_Trip, Date Date, int Id_Driver, String First_Name, String Last_Name, String Ticket, String BOL, String Truck, String Trailer, Float Weight, Float Cost_of_the_trip, String Description_of_the_cost, Float Amount, Float Driver_Pay, int Year, String Type, String Added_By, String Miles, String Owner, Float Bonus, String Bonus_Details, String Ticket_Percentage, Float SJFS_Percentage, Float S_J_F_S, Float Bonus_Driver, String Details_Bonus_Driver) {
        this.Id = Id;
        this.Period = Period;
        this.No_Trip = No_Trip;
        this.Date = Date;
        this.Id_Driver = Id_Driver;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Ticket = Ticket;
        this.BOL = BOL;
        this.Truck = Truck;
        this.Trailer = Trailer;
        this.Weight = Weight;
        this.Cost_of_the_trip = Cost_of_the_trip;
        this.Description_of_the_cost = Description_of_the_cost;
        this.Amount = Amount;
        this.Driver_Pay = Driver_Pay;
        this.Year = Year;
        this.Type = Type;
        this.Added_By = Added_By;
        this.Miles = Miles;
        this.Owner = Owner;
        this.Bonus = Bonus;
        this.Bonus_Details = Bonus_Details;
        this.Ticket_Percentage = Ticket_Percentage;
        this.SJFS_Percentage = SJFS_Percentage;
        this.S_J_F_S = S_J_F_S;
        this.Bonus_Driver = Bonus_Driver;
        this.Details_Bonus_Driver = Details_Bonus_Driver;
    }
}