package com.nearcode.designpattern.adapter.databaseexample;

import java.sql.ResultSet;

// legacy database driver library
public class LegacyDatabaseDriverImpl implements LegacyDatabaseDriver {

    @Override
    public void connect(String host, String user, String password) {
        System.out.println("Connection established.");
    }

    @Override
    public ResultSet query(String query) {
        System.out.println("Query executed");
        return null;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected");
    }
}
