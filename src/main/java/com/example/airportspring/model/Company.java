package com.example.airportspring.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table ( name = "company" )
public class Company {
    
    @Id
    @GeneratedValue
    @Column ( name = "id" )
    private long              id;
    @Column ( name = "name" )
    private String           name;
    @Column ( name = "founding_date" )
    private Date             foundingDate;
    @OneToMany ( mappedBy = "company" )
    private List<Trip> trips;
    
    public Company () {}
    
    public Company (String name, Date foundingDate) {
        this.name = name;
        this.foundingDate = foundingDate;
    }
    
    public long getId () {
        return id;
    }
    
    public void setId (long id) {
        this.id = id;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public Date getFoundingDate () {
        return foundingDate;
    }
    
    public void setFoundingDate (Date foundingDate) {
        this.foundingDate = foundingDate;
    }
    
    public List <Trip> getTrips () {
        return trips;
    }
    
    public void setTrips (List <Trip> trips) {
        this.trips = trips;
    }
}
