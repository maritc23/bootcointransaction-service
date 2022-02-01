package com.nttdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nttdata.model.BootCoinTransaction;
import com.nttdata.service.BootCoinTransactionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/bootcointransaction")
public class BootCoinTransactionController {

    @Autowired
    BootCoinTransactionService bootCoinTransactionService;

    Logger log = LoggerFactory.getLogger(BootCoinTransactionController.class);

    @PostMapping("/create")
    public Mono<BootCoinTransaction> createBootCoinTransaction(@RequestBody BootCoinTransaction bootCoinTransaction){
        return bootCoinTransactionService.createBootCoinTransaction(bootCoinTransaction);
    }

    @PostMapping("/transaction")
    public Mono<BootCoinTransaction> processBootCoinTransaction(@RequestParam("id") String id, @RequestParam("response") String response){
        return bootCoinTransactionService.processBootCoinTransaction(id, response);
    }

    @GetMapping("/listAll")
    public Flux<BootCoinTransaction> getTransactions(){
        return bootCoinTransactionService.getTransactions();
    }
}
