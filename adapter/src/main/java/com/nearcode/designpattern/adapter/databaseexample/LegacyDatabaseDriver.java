package com.nearcode.designpattern.adapter.databaseexample;

import java.sql.ResultSet;

// legacy database driver library
public interface LegacyDatabaseDriver {
    void connect(String host, String user, String password);
    ResultSet query(String query);
    void disconnect();
}
