package org.example.kharifi.oussama.service;


import org.example.kharifi.oussama.dto.ClientDTO;
import java.util.List;

public interface ClientService {
    List<ClientDTO> getAllClients();
    ClientDTO saveClient(ClientDTO client);
}
