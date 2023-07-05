/*
 * package com.spring.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import com.spring.dao.AccountDao; import com.spring.dao.AccountDaoImpl;
 * import com.spring.service.AccountService; import
 * com.spring.service.AccountServiceImpl;
 * 
 * import oracle.jdbc.pool.OracleDataSource;
 * 
 * @Configuration public class AccountConfig {
 * 
 * @Bean public OracleDataSource dataSource() { OracleDataSource dataSource =
 * null;
 * 
 * try { dataSource = new OracleDataSource();
 * dataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
 * dataSource.setUser("system"); dataSource.setPassword("Sudha7878"); } catch
 * (Exception e) { e.printStackTrace(); } return dataSource; }
 * 
 * @Bean public AccountService accountService() { AccountService accountService
 * = new AccountServiceImpl(); return accountService; }
 * 
 * @Bean public AccountDao accountDao() { AccountDao accountDao = new
 * AccountDaoImpl(); return accountDao; }
 * 
 * }
 */