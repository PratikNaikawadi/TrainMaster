package com.TrainMaster.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sound.midi.Sequence;



public class DBconnection {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/traindestinations";
		String username = "root";
		String password = "P@ssword";
		String query = "select * from traindestinations.destinations;";
		
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			String data = rs.getString(2);
			System.out.println(rs.getString(1) +" " + data   );
			
		}

		st.close();
		con.close();
	}

	}


