package com.enset.ma;

import com.enset.ma.entities.Wallet;
import com.enset.ma.repository.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableDiscoveryClient
public class WalletServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(WalletRepository walletRepository, RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.exposeIdsFor(Wallet.class);
        return args -> {
            for (int i = 1; i < 10; i++) {
                walletRepository.saveAll(List.of(
                        Wallet.builder()
                                .solde(1500 + Math.random() * 1200)
                                .dateCreation(new Date())
                                .devise("MAD").build()
                ));
            }
        };
    }

}