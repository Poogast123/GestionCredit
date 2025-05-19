package org.example.exam_final.service;


import org.example.exam_final.dto.ClientDTO;
import java.util.List;

public interface ClientService {
    List<ClientDTO> getAllClients();
    ClientDTO saveClient(ClientDTO client);
}
