package com.neatcode.designpattern.factory;

public class ConcertTicket implements Ticket {

    @Override
    public void purchase() {
        System.out.println("Purchasing a concert ticket...");
        // Additional concert ticket specific logic
    }
}
