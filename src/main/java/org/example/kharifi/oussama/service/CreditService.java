package org.example.kharifi.oussama.service;


import org.example.kharifi.oussama.entity.Credit;

import java.util.List;

public interface CreditService {
    Credit ajouterCredit(Credit credit);
    List<Credit> getAllCredits();
    Credit getCreditById(Long id);
    void deleteCredit(Long id);
}
