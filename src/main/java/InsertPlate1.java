import java.sql.*;
import java.util.Scanner;

public class InsertPlate1 {
    public static void main(String[] args) {
        String host = "localhost";
        String port = "3306";
        String database = "tablice";
        String username = "root";
        String password = "10joes10";
        String cp = "utf8";

        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?characterEncoding=" + cp;

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = connection.prepareStatement("insert into plates values (?, 0, 0)");

            Scanner scanner = new Scanner(System.in, "cp850");
            System.out.println("Type license plate:");
            String plate = scanner.nextLine();

            ps.setString(1, plate);

            System.out.println("Statement: " + ps);

            ps.execute();

            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}