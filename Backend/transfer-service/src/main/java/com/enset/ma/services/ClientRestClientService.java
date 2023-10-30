package com.enset.ma.services;

import com.enset.ma.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client-service")
public interface ClientRestClientService {
    @GetMapping("/clients/{id}")
    public Client customerById(@PathVariable Long id);

    @GetMapping("/clients")
    public PagedModel<Client> allCustomers();
}
