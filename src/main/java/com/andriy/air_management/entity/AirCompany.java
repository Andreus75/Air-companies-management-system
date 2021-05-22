package com.andriy.air_management.entity;

import javax.persistence.*;


import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "air_companys")
public class AirCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompany;
    private String nameCompany;
    private String companyType;
    private Date foundedAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Airplane> airplanes;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Flight flight;

    public AirCompany() {
    }

    public AirCompany(int idCompany, String nameCompany, String companyType, Date foundedAt) {
        this.idCompany = idCompany;
        this.nameCompany = nameCompany;
        this.companyType = companyType;
        this.foundedAt = foundedAt;
    }

    public AirCompany(int idCompany, String companyType, Date foundedAt, List<Airplane> airplanes, Flight flight) {
        this.idCompany = idCompany;
        this.companyType = companyType;
        this.foundedAt = foundedAt;
        this.airplanes = airplanes;
        this.flight = flight;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public Date getFoundedAt() {
        return foundedAt;
    }

    public void setFoundedAt(Date foundedAt) {
        this.foundedAt = foundedAt;
    }

    @Override
    public String toString() {
        return "AirCompany{" +
                "idCompany=" + idCompany +
                ", nameCompany='" + nameCompany + '\'' +
                ", companyType='" + companyType + '\'' +
                ", foundedAt=" + foundedAt +
                ", airplanes=" + airplanes +
                ", flight=" + flight +
                '}';
    }
}
