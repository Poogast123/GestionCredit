package org.example.kharifi.oussama.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class Remboursement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private Double montant;

    @Enumerated(EnumType.STRING)
    private TypeRemboursement type;

    @ManyToOne
    @JoinColumn(name = "credit_id")
    private Credit credit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public TypeRemboursement getType() {
        return type;
    }

    public void setType(TypeRemboursement type) {
        this.type = type;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }


}

