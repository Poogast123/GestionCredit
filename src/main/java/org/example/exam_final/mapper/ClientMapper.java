package org.example.exam_final.mapper;

import org.example.exam_final.dto.ClientDTO;
import org.example.exam_final.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO dto);
}