package com.andriy.air_management.entity;


import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlight;
    private FlightStatus flightStatus = FlightStatus.ACTIVE;
    private String departureCountry;
    private String destinationCountry;
    private int distance;
    private int estimatedFlightTime;
    private Date endedAt;
    private int delayStarted;
    private Date createAt;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private AirCompany airCompany;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Airplane airplane;

    public Flight() {
    }

    public Flight(int idFlight, FlightStatus flightStatus, String departureCountry, String destinationCountry, int distance, int estimatedFlightTime, Date endedAt, int delayStarted, Date createAt) {
        this.idFlight = idFlight;
        this.flightStatus = flightStatus;
        this.departureCountry = departureCountry;
        this.destinationCountry = destinationCountry;
        this.distance = distance;
        this.estimatedFlightTime = estimatedFlightTime;
        this.endedAt = endedAt;
        this.delayStarted = delayStarted;
        this.createAt = createAt;
    }

    public Flight(int idFlight, FlightStatus flightStatus, String departureCountry, String destinationCountry, int distance, int estimatedFlightTime, Date endedAt, int delayStarted, Date createAt, AirCompany airCompany, Airplane airplane) {
        this.idFlight = idFlight;
        this.flightStatus = flightStatus;
        this.departureCountry = departureCountry;
        this.destinationCountry = destinationCountry;
        this.distance = distance;
        this.estimatedFlightTime = estimatedFlightTime;
        this.endedAt = endedAt;
        this.delayStarted = delayStarted;
        this.createAt = createAt;
        this.airCompany = airCompany;
        this.airplane = airplane;
    }

    public int getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getDepartureCountry() {
        return departureCountry;
    }

    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getEstimatedFlightTime() {
        return estimatedFlightTime;
    }

    public void setEstimatedFlightTime(int estimatedFlightTime) {
        this.estimatedFlightTime = estimatedFlightTime;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    public int getDelayStarted() {
        return delayStarted;
    }

    public void setDelayStarted(int delayStarted) {
        this.delayStarted = delayStarted;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public AirCompany getAirCompany() {
        return airCompany;
    }

    public void setAirCompany(AirCompany airCompany) {
        this.airCompany = airCompany;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "idFlight=" + idFlight +
                ", flightStatus=" + flightStatus +
                ", departureCountry='" + departureCountry + '\'' +
                ", destinationCountry='" + destinationCountry + '\'' +
                ", distance=" + distance +
                ", estimatedFlightTime=" + estimatedFlightTime +
                ", endedAt=" + endedAt +
                ", delayStarted=" + delayStarted +
                ", createAt=" + createAt +
                ", airCompany=" + airCompany +
                ", airplane=" + airplane +
                '}';
    }
}
