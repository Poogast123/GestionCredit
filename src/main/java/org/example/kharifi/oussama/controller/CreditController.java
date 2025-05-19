package org.example.kharifi.oussama.controller;


import org.example.kharifi.oussama.entity.Credit;
import org.example.kharifi.oussama.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credits")
@CrossOrigin(origins = "*")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @PostMapping
    public Credit create(@RequestBody Credit credit) {
        return creditService.ajouterCredit(credit);
    }

    @GetMapping
    public List<Credit> getAll() {
        return creditService.getAllCredits();
    }

    @GetMapping("/{id}")
    public Credit getById(@PathVariable Long id) {
        return creditService.getCreditById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        creditService.deleteCredit(id);
    }
}
