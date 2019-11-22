package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class MySQLConnUtils {
    
    public static Connection getMySQLConnection() 
            throws SQLException, ClassNotFoundException, FileNotFoundException {
        File file = new File("C:\\Users\\minhn\\Documents\\GitHub\\PTIT-Database-and-Java-project\\DataBaseAcc");
        Scanner sc = new Scanner(file);
        
        String hostName = "";
        String dbName = "";
        String userName = "";
        String password = "";
        
        if (sc.hasNextLine()) {
            String[] dbAcc = sc.nextLine().split(";");
            
            hostName = dbAcc[0];
            dbName = dbAcc[1];
            userName = dbAcc[2];
            password = dbAcc[3];
        }
        
        return getMySQLConnection(hostName, dbName, userName, password);
    }
    
    public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) 
            throws SQLException, ClassNotFoundException {
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection conn = DriverManager.getConnection(connectionURL, userName,
             password);
        
        return conn;
    }
    
}
