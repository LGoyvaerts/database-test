package ch.ti8m.apprentice.lorris.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * DAO (Data Access Object) for Pizza
 * Created by gol on 24.01.2017.
 */
public class PizzaDAO {

    // JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    // Database credentials
    private static final String DB_HOST = "localhost";
    private static final String DB_NAME = "pizzakurier";
    private static final String DB_USER = "lorris";
    private static final String DB_PASS = "L2o0g0o1";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + "/" + DB_NAME + "?useSSL=false&serverTimezone=UTC";

    public void create(Pizza pizza) throws Exception {
        // create a connection
        // hint: try-with-resources (since Java 7)
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

            // create a statement
            try (Statement statement = connection.createStatement()) {

                String sql = "insert into pizza (name, price) values (" + pizza.getName() + ", " + pizza.getPrice() + " );";
                int rowsUpdated = statement.executeUpdate(sql);

            }
        }
    }

    public Pizza findById(long id) throws Exception {
        // create a connection
        // hint: try-with-resources (since Java 7)
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

            // create a statement
            try (Statement statement = connection.createStatement()) {

                String sql = "select * from pizza where id=" + id + ";";
                int rowsUpdated = statement.executeUpdate(sql);

            }
        }
    }

    public Pizza findByName(String name) throws Exception {
        String name1;
        // create a connection
        // hint: try-with-resources (since Java 7)
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {


            try (Statement statement = connection.createStatement()) {

                String sql = "select * from pizza where name=" + name + ";";
                try (ResultSet resultSet = statement.executeQuery(sql)) {

                    while (resultSet.next()) {

                        name1 = resultSet.getString("name");

                    }
                }

            }
        }
        return name1;
    }

    public void update(Pizza pizza) throws Exception {
        // create a connection
        // hint: try-with-resources (since Java 7)
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

            // create a statement
            try (Statement statement = connection.createStatement()) {

                String sql = "update pizza set name='" + pizza.setName();
                +"' where name='" + pizza.getName() + ";";
                int rowsUpdated = statement.executeUpdate(sql);

            }
        }
    }

    public void delete(Pizza pizza) throws Exception {
        // create a connection
        // hint: try-with-resources (since Java 7)
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {

            try (Statement statement = connection.createStatement()) {

                String sql = "delete from pizza where name='" + pizza.getName() + ";";
                int rowsUpdated = statement.executeUpdate(sql);

            }
        }
    }

}
