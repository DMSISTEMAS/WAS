package org.cce.sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private final String url = "jdbc:mysql://localhost:3306/db_cce?serverTimezone=UTC";
	private final String usr = "root";
	private final String pwd = "";

	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public void Conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con = DriverManager.getConnection(url, usr, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void Cerrar() {
		try {
			if (this.con != null) {
				if (this.con.isClosed()) {
					this.con.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
