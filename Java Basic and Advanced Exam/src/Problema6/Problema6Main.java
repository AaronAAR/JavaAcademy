package Problema6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Problema6Main {
    public static List<StateModel> state = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        Connection connection = Problema6Connection.getConnection();
        String sql = "SELECT * FROM state";
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));

            StateModel st = new StateModel();

            st.setDescription("description");
            st.setShipping_zone_id("shipping_zone_id");

            state.add(st);
            System.out.println(state);
        }
        System.out.println(state.size());
        connection.close();
        printTxt(String.valueOf(state));
    }

    private static void printTxt(String data) {
        File file = new File("C:\\Users\\aaron\\OneDrive\\Escritorio\\Java Basic and Advanced Exam\\src\\Problema6\\PrintDB.txt");

        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
