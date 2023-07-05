package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.AccountDao;
import com.spring.dto.Account;

@Service("accService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public String createAccount(String accNo, String accName, String accType, int balance) {
		return accountDao.create(accNo, accName, accType, balance);
	}

	@Override
	public String searchAccount(String accNo) {
		return accountDao.search(accNo);
	}

	@Override
	public Account getAccount(String accNo) {
		return accountDao.getAccount(accNo);
	}

	@Override
	public String updateAccount(String accNo, String accName, String accType, int balance) {
		return accountDao.update(accNo, accName, accType, balance);
	}

	@Override
	public String deleteAccount(String accNo) {
		return accountDao.delete(accNo);
	}

}
