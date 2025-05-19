package org.example.kharifi.oussama.controller;


import org.example.kharifi.oussama.dto.ClientDTO;
import org.example.kharifi.oussama.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<ClientDTO> getClients() {
        return clientService.getAllClients();
    }

    @PostMapping
    public ClientDTO save(@RequestBody ClientDTO clientDTO) {
        return clientService.saveClient(clientDTO);
    }
}

