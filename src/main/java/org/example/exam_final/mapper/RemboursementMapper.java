package org.example.exam_final.mapper;


import org.example.exam_final.dto.RemboursementDTO;
import org.example.exam_final.entity.Remboursement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RemboursementMapper {

    RemboursementDTO toDto(Remboursement remboursement);

    Remboursement toEntity(RemboursementDTO dto);
}

