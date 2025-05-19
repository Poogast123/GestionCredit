package org.example.exam_final.mapper;



import org.example.exam_final.dto.CreditDTO;
import org.example.exam_final.entity.Credit;

public class CreditMapper {
    public static CreditDTO toDTO(Credit credit) {
        CreditDTO dto = new CreditDTO();
        dto.setId(credit.getId());
        dto.setDateDemande(credit.getDateDemande());
        dto.setStatut(credit.getStatut().toString());
        dto.setDateAcceptation(credit.getDateAcceptation());
        dto.setMontant(credit.getMontant());
        dto.setDuree(credit.getDuree());
        dto.setTauxInteret(credit.getTauxInteret());
        dto.setClientId(credit.getClient().getId());
        return dto;
    }
}

