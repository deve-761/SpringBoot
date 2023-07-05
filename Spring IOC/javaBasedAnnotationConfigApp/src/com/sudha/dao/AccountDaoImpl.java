package com.sudha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.sudha.Account;

@Component
public class AccountDaoImpl implements AccountDao {

	@Autowired(required = true)
	private MysqlDataSource dataSource;

	String status = "";

	@Override
	public String create(String accNo, String accName, String accType, int balance) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				status = "Record Existed";
			} else {
				pst = con.prepareStatement("insert into account values(?,?,?,?)");
				pst.setString(1, accNo);
				pst.setString(2, accName);
				pst.setString(3, accType);
				pst.setInt(4, balance);
				pst.executeUpdate();
				status = "success";
			}
		} catch (SQLException e) {
			status = "Failure";
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
				status = "[ACCNO:" + rs.getString("accNo") + ",ACCNAME:" + rs.getString("accName") + ",ACCTYPE:"
						+ rs.getString("accType") + ",BALANCE:" + rs.getInt("balance") + "]";
			} else {
				status = "Account Not Existed";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Account getAccount(String accNo) {
		Account acc = null;
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				acc = new Account();
				acc.setAccNo(rs.getString("accNo"));
				acc.setAccName(rs.getString("accName"));
				acc.setBalance(rs.getInt("balance"));
			} else {
				acc = null;
			}
		} catch (Exception e) {

		}
		return acc;
	}

	@Override
	public String update(String accNo, String accName, String accType, int balance) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("update account set accName=?,accType=?,balance=? where accNo=?");
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
				status = "not-existed";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

}
