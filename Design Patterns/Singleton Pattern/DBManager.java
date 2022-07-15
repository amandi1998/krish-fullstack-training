package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static volatile DBManager dbManager;// = new DBManager();
    private static volatile Connection connection;


    private DBManager(){
        if (dbManager != null)
        {
            throw new RuntimeException("Please use getDBManager method");
        }

    }

    public static DBManager getDbManager() {

        synchronized (DBManager.class) {
            if (dbManager == null) {
                dbManager = new DBManager();
            }
        }
        return dbManager;
    }

    public static class getDbManager extends DBManager {
    }

    public Connection getConnection(){

        if (connection == null){
            synchronized (DBManager.class){
                if (connection == null){
                    String url="jdbc:derby:memory:sample;create=true";
                    try {
                        connection = DriverManager.getConnection(url);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

        return connection;
    }
}
