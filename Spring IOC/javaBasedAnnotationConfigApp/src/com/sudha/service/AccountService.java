package com.sudha.service;

import com.sudha.Account;

public interface AccountService {

	public String createAccount(String accNo, String accName, String accType, int balance);

	public String searchAccount(String accNo);

	public Account getAccount(String accNo);

	public String updateAccount(String accNo, String accName, String accType, int balance);

	public String deleteAccount(String accNo);
}
