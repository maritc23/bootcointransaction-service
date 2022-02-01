package com.nttdata.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.model.BootCoinTransaction;

@Repository
public interface BootCoinTransactionRepository extends ReactiveMongoRepository<BootCoinTransaction, String> {
}
