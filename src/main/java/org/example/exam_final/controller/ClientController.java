package org.example.exam_final.controller;


import org.example.exam_final.dto.ClientDTO;
import org.example.exam_final.service.ClientService;
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

