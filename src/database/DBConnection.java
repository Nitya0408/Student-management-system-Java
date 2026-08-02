/**
 * Creates MySQL database connection.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Jhjjssn@7";

    public static Connection getConnection() {

        try {

            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("=================");
            System.out.println(" Database Connected Successfully!");
            System.out.println("=================");
            return connection;

        } catch (SQLException e) {

            System.out.println("❌ Database Connection Failed!");

            e.printStackTrace();

            return null;
        }
    }
}
