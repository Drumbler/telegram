package org.example.service;

import org.example.buttons.Currency;
import org.example.service.impl.CbrCurrencyConversionService;

public interface CurrencyConversionService {

    static CurrencyConversionService getInstance() {
        return new CbrCurrencyConversionService();
    }

    double getConversionRatio(Currency original, Currency target);
}