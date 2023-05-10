package com.neatcode.designpattern.factory;

public class Application {
    public static void main(String[] args) {
        Ticket movieTicket = TicketFactory.createTicket(TicketType.MOVIE);
        movieTicket.purchase(); // Output: Purchasing a movie ticket...

        Ticket concertTicket = TicketFactory.createTicket(TicketType.CONCERT);
        concertTicket.purchase(); // Output: Purchasing a concert ticket...

        Ticket matchTicket = TicketFactory.createTicket(TicketType.MATCH);
        matchTicket.purchase(); // Output: Purchasing a match ticket...
    }
}
