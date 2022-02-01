package com.nttdata.config.util;

import org.springframework.beans.factory.annotation.Value;

public abstract class constants {

    @Value("${value.exchangeRate}")
    public static final double exchangeRate=20.35;
}
