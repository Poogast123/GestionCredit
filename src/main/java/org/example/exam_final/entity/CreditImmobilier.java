package org.example.exam_final.entity;


import jakarta.persistence.Entity;

@Entity
public class CreditImmobilier extends Credit {

    private String typeBien;

    public String getTypeBien() {
        return typeBien;
    }

    public void setTypeBien(String typeBien) {
        this.typeBien = typeBien;
    }


}

