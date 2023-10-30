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


    @GetMapping("/fullOrder")
    public List<Transfer> getOrders() {
        List<Transfer> transfers = transferRepository.findAll();
//        List<Client> customers = clientRestClientService.allCustomers().getContent().stream().toList();
        return transfers;
//        Random random = new Random();
//        transfers.forEach(o -> {
//            o.setClient(customers.get(random.nextInt(customers.size())));
//            o.getProductItems()
//                    .forEach(pi -> {
//                        Product product = walletRestClientService.productById(pi.getProductId());
//                        pi.setProduct(product);
//                    });
//        });
//        return transfers;
    }
//
//    @GetMapping("/fullOrder/{id}")
//    public Transfer getOrder(@PathVariable Long id) {
//        Transfer transfer = transferRepository.findById(id).get();
//        Customer customer = clientRestClientService.customerById(transfer.getCustomerId());
//        transfer.setCustomer(customer);
//        transfer.getProductItems().forEach(pi -> {
//            Product product = walletRestClientService.productById(pi.getProductId());
//            pi.setProduct(product);
//        });
//        return transfer;
//    }
}
