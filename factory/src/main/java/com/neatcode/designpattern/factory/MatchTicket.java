package com.neatcode.designpattern.factory;

public class MatchTicket implements Ticket {

    @Override
    public void purchase() {
        System.out.println("Purchasing a match ticket...");
        // Additional match ticket specific logic
    }
}
