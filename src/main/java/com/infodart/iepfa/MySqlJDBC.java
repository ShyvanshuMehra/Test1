package com.infodart.iepfa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlJDBC {

	public static void main(String[] args) {
		try {

			Connection con = DriverManager.getConnection("jdbc:mysql:///iepfa", "root", "root");

			Statement st = con.createStatement();

			String query = "select * from user_master";

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " "
						+ rs.getString(8) + " " + rs.getString(9) + " " + rs.getString(10));

			}

			con.close();

		} catch (SQLException e) {

			System.out.println("Error");

		} catch (Exception e) {

		}

	}

}
