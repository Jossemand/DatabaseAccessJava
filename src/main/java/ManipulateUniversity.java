import java.sql.*;
import java.util.Scanner;

public class ManipulateUniversity {
    public static void main(String[] args) {
        String host = "localhost";
        String port = "3306";
        String database = "universityDB";
        String username = "root";
        String password = "10joes10";
        String cp = "utf8";

        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?characterEncoding=" + cp;

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Scanner scanner = new Scanner(System.in, "cp850");
            System.out.println("Type sql manipulation:");
            String sqlManipulation = scanner.nextLine();

            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlManipulation);

            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
