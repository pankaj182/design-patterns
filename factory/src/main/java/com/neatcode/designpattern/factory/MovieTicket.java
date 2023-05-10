package com.neatcode.designpattern.factory;

public class MovieTicket implements Ticket {

    @Override
    public void purchase() {
        System.out.println("Purchasing a movie ticket...");
        // Additional movie ticket specific logic
    }
}
