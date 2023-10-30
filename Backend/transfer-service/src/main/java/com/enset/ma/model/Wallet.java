package com.enset.ma.model;

import lombok.Data;

import java.util.Date;

@Data
public class Wallet {
    private String id;
    private double solde;
    private Date dateCreation;
    private String devise;
}
