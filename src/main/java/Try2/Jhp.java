package Try2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jhp {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("mysql:jdbc://localhost:3306" ,"root", "root");
		Statement statement=connection.createStatement();
		boolean e=statement.execute("create database Panda1");
		connection.close();
		}
}

