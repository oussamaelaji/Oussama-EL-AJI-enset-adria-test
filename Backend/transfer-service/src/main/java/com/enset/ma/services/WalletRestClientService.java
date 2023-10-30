package com.enset.ma.services;

import com.enset.ma.model.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "wallet-service")
public interface WalletRestClientService {
    @GetMapping("/wallets/{id}")
    public Wallet productById(@PathVariable Long id);

    @GetMapping("/wallets")
    public PagedModel<Wallet> allProducts();
}
