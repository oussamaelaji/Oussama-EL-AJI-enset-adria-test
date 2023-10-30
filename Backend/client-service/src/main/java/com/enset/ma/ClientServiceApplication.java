package com.enset.ma;

import com.enset.ma.entities.Client;
import com.enset.ma.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository, RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.exposeIdsFor(Client.class);
        return args -> {
            clientRepository.saveAll(List.of(
                    Client.builder().name("Oussama").email("Oussama@gmail.com").build(),
                    Client.builder().name("Anas").email("Anas@gmail.com").build(),
                    Client.builder().name("Yassin").email("Yassin@gmail.com").build()
            ));
            clientRepository.findAll().forEach(System.out::println);
        };
    }
}
