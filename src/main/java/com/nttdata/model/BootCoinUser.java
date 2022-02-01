package com.nttdata.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BootCoinUser {
    private String id;

    private String identification; //DNI, CEX or Passport.
    private String phone;
    private String email;

    private double amount;
    private double money;
}
