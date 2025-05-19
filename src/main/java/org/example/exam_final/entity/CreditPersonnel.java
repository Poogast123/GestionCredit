package org.example.exam_final.entity;


import jakarta.persistence.Entity;

@Entity
public class CreditPersonnel extends Credit {

    private String motif;

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }


}

