package com.enset.ma.web;

import com.enset.ma.entities.Transfer;
import com.enset.ma.repository.TransferRepository;
import com.enset.ma.services.ClientRestClientService;
import com.enset.ma.services.WalletRestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OderRestController {

    private TransferRepository transferRepository;
    private ClientRestClientService clientRestClientService;
    private WalletRestClientService walletRestClientService;

    public OderRestController(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }
}