package com.company;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        long start;
        long end;

	// write your code here
        DBManager dbManager = new DBManager.getDbManager();
        System.out.println(dbManager);

        start = System.currentTimeMillis();
        Connection  connection = dbManager.getConnection();
        end = System.currentTimeMillis();

        System.out.println(end-start);



        DBManager dbManager1 = new DBManager.getDbManager();

        start = System.currentTimeMillis();
        Connection  connection1 = dbManager.getConnection();
        System.out.println(dbManager1);
        end = System.currentTimeMillis();
    }
}
