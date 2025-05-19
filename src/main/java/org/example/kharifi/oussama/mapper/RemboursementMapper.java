package org.example.kharifi.oussama.mapper;


import org.example.kharifi.oussama.dto.RemboursementDTO;
import org.example.kharifi.oussama.entity.Remboursement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RemboursementMapper {

    RemboursementDTO toDto(Remboursement remboursement);

    Remboursement toEntity(RemboursementDTO dto);
}

