package com.spring.dao;

import com.spring.dto.Account;

public interface AccountDao {

	public String create(String accNo, String accName, String accType, int balance);

	public String search(String accNo);

	public Account getAccount(String accNo);

	public String update(String accNo, String accName, String accType, int balance);

	public String delete(String accNo);
}
