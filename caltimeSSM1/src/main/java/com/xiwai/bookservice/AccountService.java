package com.xiwai.bookservice;

import com.xiwai.domain.Account;

import java.util.List;

public interface AccountService {
    public void save(Account account);
    public void delete(Integer id);
    public void update(Account account);
    public List<Account> findAll();
    public Account findById(Integer id);

}
