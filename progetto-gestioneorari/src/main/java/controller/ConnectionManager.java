package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {

    /* a single shared database connection */
    private static Connection connection = null;

    private ConnectionManager() {/* no object creation */ }

    /* the public accessor uses lazy instantiation */
    public static Connection getConnection() throws IOException, SQLException {
        if (connection == null) {
            try {
                connection = makeConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectionManager.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }

    private static Connection makeConnection() throws SQLException, IOException,
            ClassNotFoundException {
        InputStream input = null;
        Properties props = new Properties();
        try {
            input = Files.newInputStream(Paths.get("C:\\Users\\andrea\\git\\progetto-gestioneorari-1-gruppo-gestioneorari-1\\progetto-gestioneorari\\UtilityFiles\\database.config.txt"));
            props.load(input);

        } catch (FileNotFoundException e) {
            Logger.getLogger(ConnectionManager.class.getName()).
                    log(Level.SEVERE, null, e);
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        return DriverManager.getConnection(url, username, password);
    }

    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
