package com.github.OMEN44.rate.spi;

import com.github.OMEN44.rate.api.QuoteManager;

public interface ExchangeRateProvider {
    QuoteManager create();
}