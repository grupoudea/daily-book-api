package com.ritallus.dailybookapi.client.infrastructure.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    @PostMapping
    public ResponseEntity<String> createClient(){
        LOGGER.info("Creating client...");
        return ResponseEntity.ok("A client has been created!");
    }

    @PutMapping
    public ResponseEntity<String> updateClient(){
        LOGGER.info("Updating client...");
        return ResponseEntity.ok("A client has been updated!");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteClient(){
        LOGGER.info("Deleting client...");
        return ResponseEntity.ok("A client has been deleted!");
    }

    @GetMapping("/get-by-id/{clientId}")
    public ResponseEntity<String> getClientById(@PathVariable Integer clientId) {
        LOGGER.info("Returning client...");
        return ResponseEntity.ok(String.format("A client has been returned with id %d", clientId));
    }

    @GetMapping("/get-all")
    public ResponseEntity<String> getAllClients(){
        LOGGER.info("Returning all clients...");
        return ResponseEntity.ok("Now you can see all clients!");
    }

}
