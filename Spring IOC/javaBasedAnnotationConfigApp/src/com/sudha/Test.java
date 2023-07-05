package com.sudha;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sudha.service.AccountService;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
		AccountService service = (AccountService) context.getBean("accService");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("Account Operation Options");
			System.out.println("1. Create Account");
			System.out.println("2. Search Account");
			System.out.println("3. Update Account");
			System.out.println("4. Delete Account");
			System.out.println("5. Exit");
			System.out.println("Your Option :");
			int option = Integer.parseInt(br.readLine());
			String status = "";
			String accNo = "", accName = "", accType = "";
			int balance = 0;
			switch (option) {
			case 1:
				System.out.println("Account Number :");
				accNo = br.readLine();
				System.out.println("Account Name ");
				accName = br.readLine();
				System.out.println("Account Type :");
				accType = br.readLine();
				System.out.println("Account Balance :");
				balance = Integer.parseInt(br.readLine());
				status = service.createAccount(accNo, accName, accType, balance);
				if (status.equals("success")) {
					System.out.println("Account Creation Success");
				} else if (status.equals("failure")) {
					System.out.println("Account Creation Failed");
				} else if (status.equals("Record Existed")) {
					System.out.println("Account Already Existed");
				}
				break;
			case 2:
				System.out.println("Account Number :");
				accNo = br.readLine();
				status = service.searchAccount(accNo);
				System.out.println("Account Details :" + status);
				break;
			case 3:
				System.out.println("Account Number :");
				accNo = br.readLine();
				Account acc = service.getAccount(accNo);
				if (acc == null) {
					System.out.println("Status: Account Not Existed");
				} else {
					Account acc_new = new Account();
					acc_new.setAccNo(accNo);
					System.out.println("Account Name : Old Value :" + acc.getAccName() + "New Value:");
					String accName_new = br.readLine();
					if (accName_new == null || accName_new.equals("")) {
						acc_new.setAccName(acc.getAccName());
					} else {
						acc_new.setAccName(accName_new);
					}
					System.out.println("Account Type : Old Value :" + acc.getAccType() + "New Value:");
					String accType_new = br.readLine();
					if (accType_new == null || accType_new.equals("")) {
						acc_new.setAccType(acc.getAccType());
					} else {
						acc_new.setAccType(accType_new);
					}
					System.out.println("Account Balance : Old Value :" + acc.getBalance() + "New Value:");
					String balance_new = br.readLine();
					if (balance_new == null || balance_new.equals("")) {
						acc_new.setBalance(acc.getBalance());
					} else {
						int bal_new = Integer.parseInt(balance_new);
						acc_new.setBalance(bal_new);
					}
					status = service.updateAccount(acc_new.getAccNo(), acc_new.getAccName(), acc_new.getAccType(),
							acc_new.getBalance());
					if (status.equals("success")) {
						System.out.println("Account Updated Successfully");
					}
					if (status.equals("failure")) {
						System.out.println("Account Update failed");
					}

				}
				break;
			case 4:
				System.out.println("Account Number :");
				accNo = br.readLine();
				status = service.deleteAccount(accNo);
				if (status.equals("success")) {
					System.out.println("Account Deleted Successfully");
				}
				if (status.equals("failure")) {
					System.out.println("Account deletion failure");
				}
				if (status.equals("not-existed")) {
					System.out.println("Account Not Existed");
				}
				break;
			case 5:
				System.out.println("Thank you using Account Form");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
