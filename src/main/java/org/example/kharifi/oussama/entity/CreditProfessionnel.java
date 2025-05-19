package org.example.kharifi.oussama.entity;


import jakarta.persistence.Entity;

@Entity
public class CreditProfessionnel extends Credit {

    private String motif;

    private String raisonSociale;

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }


}

