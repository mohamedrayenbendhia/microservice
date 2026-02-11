package com.esprit.microservice.jobservice;

import jakarta.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String service;

    private boolean etat; // true = disponible, false = occupé

    // Constructors
    public Job() {}

    public Job(String service, boolean etat) {
        this.service = service;
        this.etat = etat;
    }

    // Getters & Setters
    public Integer getId() { return id; }

    public String getService() { return service; }

    public void setService(String service) { this.service = service; }

    public boolean isEtat() { return etat; }

    public void setEtat(boolean etat) { this.etat = etat; }
}
