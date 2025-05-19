package org.example.exam_final.service;


import org.example.exam_final.dto.ClientDTO;
import org.example.exam_final.entity.Client;
import org.example.exam_final.mapper.ClientMapper;
import org.example.exam_final.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository repository;
    private final ClientMapper mapper;

    @Override
    public List<ClientDTO> getAllClients() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ClientDTO saveClient(ClientDTO dto) {
        Client entity = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(entity));
    }
}
