package Problema6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Problema6Connection {
    static {
        try {
            DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Problema6Connection () {

    }

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://address=(host=localhost)(port=3306)/mydb?user=root&serverTimezone=UTC&useSSL=false");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
