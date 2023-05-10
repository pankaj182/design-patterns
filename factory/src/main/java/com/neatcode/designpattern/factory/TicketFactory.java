package com.neatcode.designpattern.factory;

public class TicketFactory {
    public static Ticket createTicket(TicketType type) {
        switch(type) {
            case MOVIE:
                return new MovieTicket();
            case CONCERT:
                return new ConcertTicket();
            case MATCH:
                return new MatchTicket();
        }
        throw new IllegalArgumentException("Invalid ticket type.");
    }
}
