package com.example.airportspring.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table ( name = "trip" )
public class Trip {
    
    @Id
    @Column ( name = "id" )
    private long               id;
    @ManyToOne
    @JoinColumn ( name = "company_id" )
    private Company           company;
    @Column ( name = "town_from" )
    private String            townFrom;
    @Column ( name = "town_to" )
    private String            townTo;
    @Column ( name = "time_out" )
    private Timestamp         timeOut;
    @Column ( name = "time_in" )
    private Timestamp         timeIn;
    @OneToMany ( mappedBy = "trip" )
    private List <PassInTrip> passInTrips;
    
    public Trip () {}
    
    public Trip (long id, Company company, String townFrom, String townTo, Timestamp timeOut, Timestamp timeIn) {
        this.id = id;
        this.company = company;
        this.townFrom = townFrom;
        this.townTo = townTo;
        this.timeOut = timeOut;
        this.timeIn = timeIn;
    }
    
    public long getId () {
        return id;
    }
    
    public void setId (long id) {
        this.id = id;
    }
    
    public Company getCompany () {
        return company;
    }
    
    public void setCompany (Company company) {
        this.company = company;
    }
    
    public String getTownFrom () {
        return townFrom;
    }
    
    public void setTownFrom (String townFrom) {
        this.townFrom = townFrom;
    }
    
    public String getTownTo () {
        return townTo;
    }
    
    public void setTownTo (String townTo) {
        this.townTo = townTo;
    }
    
    public Timestamp getTimeOut () {
        return timeOut;
    }
    
    public void setTimeOut (Timestamp timeOut) {
        this.timeOut = timeOut;
    }
    
    public Timestamp getTimeIn () {
        return timeIn;
    }
    
    public void setTimeIn (Timestamp timeIn) {
        this.timeIn = timeIn;
    }
    
    public List <PassInTrip> getPassInTrips () {
        return passInTrips;
    }
    
    public void setPassInTrips (List <PassInTrip> passInTrips) {
        this.passInTrips = passInTrips;
    }
}
