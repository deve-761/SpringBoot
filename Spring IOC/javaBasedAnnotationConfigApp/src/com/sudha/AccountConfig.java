package com.sudha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.sudha.dao.AccountDao;
import com.sudha.dao.AccountDaoImpl;
import com.sudha.service.AccountService;
import com.sudha.service.AccountServiceImpl;

@Configuration
public class AccountConfig {

	@Bean
	public MysqlDataSource dataSource() {
		MysqlDataSource dataSource = null;
		try {
			dataSource = new MysqlDataSource();
			dataSource.setURL("jdbc:mysql://localhost:3306/commondb");
			dataSource.setUser("root");
			dataSource.setPassword("Sudha@7878");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}

	@Bean
	public AccountService accountService() {
		AccountService accountService = new AccountServiceImpl();
		return accountService;
	}

	@Bean
	public AccountDao accountDao() {
		AccountDao accountDao = new AccountDaoImpl();
		return accountDao;
	}
}
