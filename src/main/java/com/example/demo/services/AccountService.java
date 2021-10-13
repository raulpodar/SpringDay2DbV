package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.Account;
import com.example.demo.repos.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class AccountService  {

    private List<Account> accounts = new ArrayList<>();


    private AccountRepo repo ;

    public AccountService(AccountRepo repo) {
        super();
        this.repo = repo;
    }
    
    public String test() {
        return "Hello World!";
    }


    public Account addPerson( Account account) {
        this.accounts.add(account);
        return this.accounts.get(this.accounts.size()-1);
    }


    public List<Account> getAllPeople() {
        return this.accounts;
    }


    public Account updatePerson( int id,  Account account) {
        this.accounts.remove(id);
        this.accounts.add(id, account);
        return this.accounts.get(id);
    }


    public Account removePerson( int id) {
        return this.accounts.remove(id);
    }
}
