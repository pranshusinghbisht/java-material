package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.Account;

public interface AccountDao extends JpaRepository<Account,Integer >{

}
