package com.nearcode.designpattern.adapter.databaseexample;

import java.sql.ResultSet;

public class DatabaseAdapter implements Database {
    private LegacyDatabaseDriver thirdPartyDriver;

    public DatabaseAdapter(LegacyDatabaseDriver thirdPartyDriver) {
        this.thirdPartyDriver = thirdPartyDriver;
    }

    @Override
    public MyConnection getConnection() {
        // Convert the connect() method to the Connection object of our own database interface
        thirdPartyDriver.connect("localhost", "username", "password");
        // ideally return a new connection
        return null;
    }

    @Override
    public ResultSet executeQuery(String query) {
        // Convert the query() method to the executeQuery() method of our own database interface
        return thirdPartyDriver.query(query);
    }
}
