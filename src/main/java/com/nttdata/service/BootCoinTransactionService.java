package com.nttdata.service;

import com.nttdata.model.BootCoinTransaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BootCoinTransactionService {

    Mono<BootCoinTransaction> createBootCoinTransaction(BootCoinTransaction bootCoinTransaction);

    Mono<BootCoinTransaction> processBootCoinTransaction(String id, String response);

    Flux<BootCoinTransaction> getTransactions();
}
