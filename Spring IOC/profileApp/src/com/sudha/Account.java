package com.sudha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Account {

	private String driverClass;
	private String driverURL;
	private String dbUserName;
	private String dbPassword;

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getDriverURL() {
		return driverURL;
	}

	public void setDriverURL(String driverURL) {
		this.driverURL = driverURL;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "Account [driverClass=" + driverClass + ", driverURL=" + driverURL + ", dbUserName=" + dbUserName
				+ ", dbPassword=" + dbPassword + "]";
	}

	public void listAccounts() {
		try {
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(driverURL, dbUserName, dbPassword);
			System.out.println("URL : "+driverURL);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from account");
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			for (int i = 1; i <= columns; i++) {
				System.out.println(md.getColumnName(i) + "\t");
			}
			System.out.println();
			System.out.println("-------------------");
			while (rs.next()) {
				for (int i = 1; i <= columns; i++) {
					System.out.println(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
