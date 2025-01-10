package com.example.cubo_challenge.repository;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.cubo_challenge.entity.Client;

@DataJpaTest
public class ClientRepositoryTests {

    @Autowired
    private ClientRepository clientRepository;

    private Client client;

    @BeforeEach
    private void setClientConfiguration(){
        
        this.client = new Client("Ana", "Silva", new BigDecimal(20.00));

    }

    @Test
    public void saveClient(){
        Client savedClient = clientRepository.save(client);

        Assertions.assertNotNull(savedClient);
        Assertions.assertEquals(savedClient, client);
        Assertions.assertNotNull(savedClient.getId());
    }

    @Test
    public void findAllClients(){
        Client savedClient = clientRepository.save(client);
        Client savedClient2 = clientRepository.save(client);

        List<Client> allClients = clientRepository.findAll();

        Assertions.assertNotNull(allClients);
        Assertions.assertEquals(allClients.get(0), savedClient);
    }

}
