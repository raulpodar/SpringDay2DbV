package com.example.demo.controllers;

import java.util.List;

import javax.websocket.server.PathParam;


import com.example.demo.Account;
import com.example.demo.services.AccountService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    private AccountService service;

    public AccountController(AccountService service) {
        super();
        this.service=service;
    }


    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @PostMapping("/create")
    public Account addAccount(@RequestBody Account account) {
        return this.service.addPerson(account);
    }

    @GetMapping("/getAll")
    public List<Account> getAll() {
        return this.service.getAllPeople();
    }

    @PutMapping("/update")
    public Account addAccount(@PathParam("id") int id, @RequestBody Account account) {

        return this.service.updatePerson(id, account);
    }

    @DeleteMapping("/delete/{id}")
    public Account removeAccount(@PathVariable int id) {
        return this.service.removePerson(id);
    }

}
