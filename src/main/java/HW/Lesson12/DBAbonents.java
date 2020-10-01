package HW.Lesson12;

import LESS.Lesson12.DBDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class DBAbonents {
    private static Logger LOG = LogManager.getLogger(DBAbonents.class.getName());
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo?user=root&password=skpass&serverTimezone=UTC";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement statement = connection.prepareStatement("insert into abonent (first_name, last_name, gender, age) values (?,?,?,?)");
            // вставка
            String abName = "Petya";
            int abAge = 14;
            statement.setString(1, "Таня");
            statement.setString(2, "Половко");
            statement.setString(3, "f");
            statement.setInt(4,33);
            statement.execute();

            // чтение из БД
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM ABONENT");
//
//            while (resultSet.next()) { // указатель на следующую строку
//                String name = resultSet.getString("first_name");
//                String lastName = resultSet.getString("last_name");
//                String gender = resultSet.getString("gender");
//                Integer age = resultSet.getInt("age");
//
//                System.out.println(name + ":" + lastName + ":" + gender + ":" + age);
//            }
           // resultSet.close();
            connection.close();

        } catch (Exception e) {
            LOG.error(e);
        }
    }
}
