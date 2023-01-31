/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

public class AltaAgua {

    private String First_Name;
    private String Last_Name;
    private String Truck;
    private String Owner;
    private String Trailer;
    private int Period;
    private int Year;
    private Date Fecha;
    private String Location;
    private float Hours;
    private String Start_Time;
    private String End_Time;
    private String Ticket;
    private float Rate;
    private float Amount;
    private float SJFS;
    private float Truck_Pay;

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

    public String getTruck() {
        return Truck;
    }

    public void setTruck(String Truck) {
        this.Truck = Truck;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getTrailer() {
        return Trailer;
    }

    public void setTrailer(String Trailer) {
        this.Trailer = Trailer;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public float getHours() {
        return Hours;
    }

    public void setHours(float Hours) {
        this.Hours = Hours;
    }

    public String getStart_Time() {
        return Start_Time;
    }

    public void setStart_Time(String Start_Time) {
        this.Start_Time = Start_Time;
    }

    public String getEnd_Time() {
        return End_Time;
    }

    public void setEnd_Time(String End_Time) {
        this.End_Time = End_Time;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    public float getRate() {
        return Rate;
    }

    public void setRate(float Rate) {
        this.Rate = Rate;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public float getSJFS() {
        return SJFS;
    }

    public void setSJFS(float SJFS) {
        this.SJFS = SJFS;
    }

    public float getTruck_Pay() {
        return Truck_Pay;
    }

    public void setTruck_Pay(float Truck_Pay) {
        this.Truck_Pay = Truck_Pay;
    }

    public AltaAgua() {
    }

    public AltaAgua(String First_Name, String Last_Name, String Truck, String Owner, String Trailer, int Period, int Year, Date Fecha, String Location, float Hours, String Start_Time, String End_Time, String Ticket, float Rate, float Amount, float SJFS, float Truck_Pay) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Truck = Truck;
        this.Owner = Owner;
        this.Trailer = Trailer;
        this.Period = Period;
        this.Year = Year;
        this.Fecha = Fecha;
        this.Location = Location;
        this.Hours = Hours;
        this.Start_Time = Start_Time;
        this.End_Time = End_Time;
        this.Ticket = Ticket;
        this.Rate = Rate;
        this.Amount = Amount;
        this.SJFS = SJFS;
        this.Truck_Pay = Truck_Pay;
    }
}