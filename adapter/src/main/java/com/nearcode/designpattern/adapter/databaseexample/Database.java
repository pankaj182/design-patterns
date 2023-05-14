package com.nearcode.designpattern.adapter.databaseexample;

import java.sql.ResultSet;

// new database interface
public interface Database {
    MyConnection getConnection();
    ResultSet executeQuery(String query);
}
