package org.example.exam_final.service;


import org.example.exam_final.entity.Credit;

import java.util.List;

public interface CreditService {
    Credit ajouterCredit(Credit credit);
    List<Credit> getAllCredits();
    Credit getCreditById(Long id);
    void deleteCredit(Long id);
}
