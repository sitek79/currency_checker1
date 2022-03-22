package ru.dudeandrey.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBC {
    public static Connection connection;
    public static Statement statmt;

    public SQLiteJDBC() {
        connectToSQLite();
    }

    public void connectToSQLite() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:currency.db");
            // path to db C:\sqlite_db
            //conn = DriverManager.getConnection("jdbc:sqlite:c:\\sqlite_db\\currency.db");
            System.out.println("Connection to DB successfull");
        } catch (ClassNotFoundException excl) {
            excl.printStackTrace(); // error handling  Class.forName
            System.out.println("JDBC not found!");
        } catch (SQLException exsq) {
            exsq.printStackTrace(); // error handling  DriverManager.getConnection
            System.out.println("SQL Error!");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        } finally {
            try {
                connection.close();       // disconnect DB
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("... database closing error");
            } finally {
                System.out.println("DB Disconnected");
            }
        }
        System.out.println("Connection to SQLite DB completed.");
    }
}
