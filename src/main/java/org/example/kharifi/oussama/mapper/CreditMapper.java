package org.example.kharifi.oussama.mapper;

import org.example.kharifi.oussama.dto.CreditDTO;
import org.example.kharifi.oussama.entity.Credit;

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

