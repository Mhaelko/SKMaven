package LESS.Lesson12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBDemo {
    private static Logger LOG = LogManager.getLogger(DBDemo.class.getName());

    public static void main (String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo?user=root&password=aYwux9VFq*JFVnu0025xrP2zQ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ABONENT");
            resultSet.next();
            String name = resultSet.getString("first_name");
            System.out.println(name);
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            LOG.error(e);
        }
    }
}
