package com.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dto.Account;

import oracle.jdbc.pool.OracleDataSource;

@Component("accDao")
public class AccountDaoImpl implements AccountDao {

	String status = "";

	@Autowired
	private OracleDataSource dataSource;

	@Override
	public String create(String accNo, String accName, String accType, int balance) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				status = "existed";
			} else {
				pst = con.prepareStatement("insert into account values(?,?,?,?)");
				pst.setString(1, accNo);
				pst.setString(2, accName);
				pst.setString(3, accType);
				pst.setInt(4, balance);
				pst.executeUpdate();
				status = "success";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String search(String accNo) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				status = "[ACCNO:" + rs.getString("ACCNO") + ",ACCNAME:" + rs.getString("ACCNAME") + ",ACCTYPE:"
						+ rs.getString("ACCTYPE") + ",BALANCE:" + rs.getInt("BALANCE") + "]";
			} else {
				status = "Account Not Existed";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Account getAccount(String accNo) {
		Account account = null;
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				account = new Account();
				account.setAccNo(rs.getString("ACCNO"));
				account.setAccName(rs.getString("ACCNAME"));
				account.setAccType(rs.getString("ACCTYPE"));
				account.setBalance(rs.getInt("BALANCE"));
			} else {
				account = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public String update(String accNo, String accName, String accType, int balance) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con
					.prepareStatement("update account set ACCNAME=?,ACCTYPE=?,BALANCE=? where ACCNO=?");
			pst.setString(1, accName);
			pst.setString(2, accType);
			pst.setInt(3, balance);
			pst.setString(4, accNo);
			pst.executeUpdate();
			status = "success";
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(String accNo) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				pst = con.prepareStatement("delete from account where accNo=?");
				pst.setString(1, accNo);
				pst.executeUpdate();
				status = "success";
			} else {
				status = "not existed";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

}
