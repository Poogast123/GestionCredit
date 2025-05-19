package org.example.exam_final.dto;


import java.time.LocalDate;
import java.util.List;

public class CreditDTO {
    private Long id;
    private LocalDate dateDemande;
    private String statut;
    private LocalDate dateAcceptation;
    private Double montant;
    private Integer duree;
    private Double tauxInteret;
    private Long clientId;
    private List<Long> remboursementsIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(LocalDate dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public LocalDate getDateAcceptation() {
        return dateAcceptation;
    }

    public void setDateAcceptation(LocalDate dateAcceptation) {
        this.dateAcceptation = dateAcceptation;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(Double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public List<Long> getRemboursementsIds() {
        return remboursementsIds;
    }

    public void setRemboursementsIds(List<Long> remboursementsIds) {
        this.remboursementsIds = remboursementsIds;
    }

}

