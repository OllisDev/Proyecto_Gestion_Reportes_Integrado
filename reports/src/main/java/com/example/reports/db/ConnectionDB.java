package com.example.reports.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public String driver = "com.mysql.jdbc.Driver";
    public String db = "gestion_db";
    public String hostname = "localhost";
    public String port = "3306";
    public String password = "root";
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + db + "?useSSL=false";
    public String username = "root";

    public Connection conectarMySQl() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
