package org.example.kharifi.oussama.service;


import org.example.kharifi.oussama.entity.Credit;
import org.example.kharifi.oussama.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public Credit ajouterCredit(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public List<Credit> getAllCredits() {
        return creditRepository.findAll();
    }

    @Override
    public Credit getCreditById(Long id) {
        return creditRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCredit(Long id) {
        creditRepository.deleteById(id);
    }
}
