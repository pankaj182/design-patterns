package com.nearcode.designpattern.adapter.databaseexample;

import java.sql.ResultSet;

public class Application {
    public static void main(String[] args) {
        LegacyDatabaseDriver thirdPartyDriver = new LegacyDatabaseDriverImpl();
        DatabaseAdapter databaseAdapter = new DatabaseAdapter(thirdPartyDriver);

        // Use the adapter to connect to the database and execute queries
        MyConnection connection = databaseAdapter.getConnection();
        ResultSet result = databaseAdapter.executeQuery("SELECT * FROM users");

    }
}
