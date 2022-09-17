package com.github.OMEN44.rate.spi;

import com.baeldung.rate.api.QuoteManager;

public interface ExchangeRateProvider {
    QuoteManager create();
}