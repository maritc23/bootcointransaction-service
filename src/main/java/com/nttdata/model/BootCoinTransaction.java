package com.nttdata.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.config.util.constants;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection="BootCoinTransaction")
public class BootCoinTransaction {

    @Id
    private String id= UUID.randomUUID().toString();

    private double price;
    private double bcAmount=price / constants.exchangeRate;

    private String status="Pending";

    private String buyer;
    private String seller;
}
