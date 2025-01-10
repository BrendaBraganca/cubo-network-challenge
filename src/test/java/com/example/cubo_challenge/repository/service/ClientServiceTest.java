package com.example.cubo_challenge.repository.service;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.cubo_challenge.entity.Client;
import com.example.cubo_challenge.entity.dto.ClientDTO;
import com.example.cubo_challenge.repository.ClientRepository;
import com.example.cubo_challenge.service.ClientService;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @InjectMocks
    private ClientService clientService;

    @Mock
    private ClientRepository clientRepository;

    private Client client;
    private ClientDTO clientDTO;

    @BeforeEach
    private void setUp(){
        client = new Client((long) 1, "Ana", "Silva", new BigDecimal(20.00));
        clientDTO = new ClientDTO("Ana", "Silva", new BigDecimal(20.00));
    }

    @Test
    public void saveTheClient(){
        when(this.clientRepository.save(ArgumentMatchers.any(Client.class))).thenReturn(client);

        Client clientSaved = clientService.saveClient(clientDTO);

        Assertions.assertEquals(clientSaved.getId(), client.getId());
        Assertions.assertNotNull(clientSaved);
    }

    @Test
    public void findAllClients(){
        List<Client> clientList = new ArrayList<>();
        clientList.add(client);
        clientList.add(client);
        clientList.add(client);

        when(this.clientRepository.findAll()).thenReturn(clientList);

        List<Client> clientListReal = clientService.listAllClients();

        Assertions.assertNotNull(clientList);
        Assertions.assertEquals(clientList, clientListReal);
        Assertions.assertNotNull(clientList.get(0).getId());
    }

}
