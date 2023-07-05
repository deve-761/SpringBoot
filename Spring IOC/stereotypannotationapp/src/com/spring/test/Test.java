package com.spring.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dto.Account;
import com.spring.service.AccountService;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
		AccountService accountService = (AccountService) context.getBean("accService");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println();
			System.out.println("Account Operations");
			System.out.println("1. Create Account");
			System.out.println("2. Search Account");
			System.out.println("3. Update Account");
			System.out.println("4. Delete Account");
			System.out.println("5. Exit");
			System.out.println("Your Option :");
			int option = Integer.parseInt(br.readLine());
			String status = "";
			String accNo = "";
			String accName = "";
			String accType = "";
			int balance = 0;
			switch (option) {
			case 1:
				System.out.println("Account Number :");
				accNo = br.readLine();
				System.out.println("Account Name :");
				accName = br.readLine();
				System.out.println("Account Type :");
				accType = br.readLine();
				System.out.println("Account Balance :");
				balance = Integer.parseInt(br.readLine());
				status = accountService.createAccount(accNo, accName, accType, balance);
				if (status.equals("success")) {
					System.out.println("Account Created Successfully");
				}
				if (status.equals("failure")) {
					System.out.println("Account Creation Failure");
				}
				if (status.equals("existed")) {
					System.out.println("Account Existed Already");
				}
				break;
			case 2:
				System.out.println("Account Number :");
				accNo = br.readLine();
				status = accountService.searchAccount(accNo);
				System.out.println("Account details :" + status);
				break;
			case 3:
				System.out.println("Account Number :");
				accNo = br.readLine();
				Account account = accountService.getAccount(accNo);
				if (account == null) {
					System.out.println("Status:Account Not Existed");
				} else {
					Account acc_new = new Account();
					acc_new.setAccNo(accNo);
					System.out.println("Account Name :Old value:" + account.getAccName() + "New Value:");
					String acc_Name_new = br.readLine();
					if (acc_Name_new == null || acc_Name_new.equals("")) {
						acc_new.setAccName(account.getAccName());
					} else {
						acc_new.setAccName(acc_Name_new);
					}
					System.out.println("Account Type :Old value:" + account.getAccType() + "New Value:");
					String acc_Type_new = br.readLine();
					if (acc_Type_new == null || acc_Type_new.equals("")) {
						acc_new.setAccType(account.getAccType());
					} else {
						acc_new.setAccType(acc_Type_new);
					}

					System.out.println("Account Balance :Old value:" + account.getBalance() + "New Value:");
					String bal = br.readLine();
					if (bal == null || bal.equals("")) {
						acc_new.setBalance(account.getBalance());
					} else {
						int bal_new = Integer.parseInt(bal);
						acc_new.setBalance(bal_new);
					}

					status = accountService.updateAccount(acc_new.getAccNo(), acc_new.getAccName(),
							acc_new.getAccType(), acc_new.getBalance());
					if (status.equals("success")) {
						System.out.println("Account updated Successfully");
					}
					if (status.equals("failure")) {
						System.out.println("Account Updation Failure");
					}
				}
				break;
			case 4:
				System.out.println("Account Number :");
				accNo = br.readLine();
				status = accountService.deleteAccount(accNo);
				if (status.equals("success")) {
					System.out.println("Account Deleted Successfully");
				}
				if (status.equals("failure")) {
					System.out.println("Account Deletion Failure");
				}
				if (status.equals("not existed")) {
					System.out.println("Account Not Existed");
				}
				break;
			case 5:
				System.out.println("*******Account Operations Performed");
				System.exit(0);
				break;
			default:
				System.out.println("Enter Number from 1,2,3,4 and 5");
			}
		}
	}
}
