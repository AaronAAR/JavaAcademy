package Problema6;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Problema6Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = Problema6Connection.getConnection();
        String sql = "SELECT * FROM state";
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        FileInputStream in = null;
        FileInputStream out = null;

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
    }
}
