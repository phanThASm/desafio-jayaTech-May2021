package com.phanthasm.currencyConverter.services;

import com.phanthasm.currencyConverter.dto.CurrencyDTO;
import com.phanthasm.currencyConverter.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrencyService {
    @Autowired
    CurrencyRepository repositoryCurrency;

    public List<CurrencyDTO> findAll() {
        return repositoryCurrency.findAll().stream().map(x -> new CurrencyDTO(x)).collect(Collectors.toList());
    }
}
