package com.example.cubo_challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cubo_challenge.entity.Client;
import com.example.cubo_challenge.entity.dto.ClientDTO;
import com.example.cubo_challenge.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/save")
    public ResponseEntity<Client> saveClient(@RequestBody ClientDTO clientDTO){
        Client client = clientService.saveClient(clientDTO);
        return ResponseEntity.ok().body(client);
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<Client>> listAllClients (){
        List<Client> clientList = clientService.listAllClients();
        return ResponseEntity.ok().body(clientList);
    }

}
