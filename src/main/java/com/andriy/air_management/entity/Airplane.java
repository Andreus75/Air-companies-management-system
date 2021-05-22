package com.andriy.air_management.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "airplanes")
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAirplane;
    private String name;
    private double factorySerialNumber;
    private int numberOfFlight;
    private int flightDistance;
    private int fuelCapacity;
    private String type;
    private Date createdAt;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private AirCompany airCompany;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Flight flight;

    public Airplane() {
    }

    public Airplane(int idAirplane, String name, double factorySerialNumber, int numberOfFlight, int flightDistance, int fuelCapacity, String type, Date createdAt) {
        this.idAirplane = idAirplane;
        this.name = name;
        this.factorySerialNumber = factorySerialNumber;
        this.numberOfFlight = numberOfFlight;
        this.flightDistance = flightDistance;
        this.fuelCapacity = fuelCapacity;
        this.type = type;
        this.createdAt = createdAt;
    }

    public Airplane(int idAirplane, String name, double factorySerialNumber, int numberOfFlight, int flightDistance, int fuelCapacity, String type, Date createdAt, AirCompany airCompany, Flight flight) {
        this.idAirplane = idAirplane;
        this.name = name;
        this.factorySerialNumber = factorySerialNumber;
        this.numberOfFlight = numberOfFlight;
        this.flightDistance = flightDistance;
        this.fuelCapacity = fuelCapacity;
        this.type = type;
        this.createdAt = createdAt;
        this.airCompany = airCompany;
        this.flight = flight;
    }

    public int getIdAirplane() {
        return idAirplane;
    }

    public void setIdAirplane(int idAirplane) {
        this.idAirplane = idAirplane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFactorySerialNumber() {
        return factorySerialNumber;
    }

    public void setFactorySerialNumber(double factorySerialNumber) {
        this.factorySerialNumber = factorySerialNumber;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public AirCompany getAirCompany() {
        return airCompany;
    }

    public void setAirCompany(AirCompany airCompany) {
        this.airCompany = airCompany;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "idAirplane=" + idAirplane +
                ", name='" + name + '\'' +
                ", factorySerialNumber=" + factorySerialNumber +
                ", numberOfFlight=" + numberOfFlight +
                ", flightDistance=" + flightDistance +
                ", fuelCapacity=" + fuelCapacity +
                ", type='" + type + '\'' +
                ", createdAt=" + createdAt +
                ", airCompany=" + airCompany +
                ", flight=" + flight +
                '}';
    }
}
