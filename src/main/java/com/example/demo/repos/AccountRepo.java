package com.example.demo.repos;


import com.example.demo.Account;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepo  extends JpaRepository<Account, Long> {
    @Override
    List<Account> findAll();


    @Override
    Optional<Account> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Account entity);
}
