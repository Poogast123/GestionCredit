package org.example.kharifi.oussama.mapper;

import org.example.kharifi.oussama.dto.ClientDTO;
import org.example.kharifi.oussama.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO dto);
}