package cinejava.service;

import java.util.ArrayList;
import java.util.List;

import cinejava.model.StudentTicket;
import cinejava.model.Ticket;
import cinejava.model.VipTicket;

public class TicketService {
    
    public List<Ticket> createSampleTicket() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("T01", "Mai", 90_000));
        tickets.add(new VipTicket("V01", "Dune", 110_000, 0.2, 30_000));
        tickets.add(new StudentTicket("S01", "Mai", 90_000, 20));
        tickets.add(new Ticket("T02", "Exhuma", 100_000));
        tickets.add(new VipTicket("V02", "Inside out", 90_000, 0.1, 25_000));
        return tickets;
    }

    public void printTicketList(List<Ticket> tickets) {
        System.out.printf("%-5s | %-12s | %10s%n", "ID", "Movie Name", "Final Price");
        System.out.println("----------------------------------------");
        for (Ticket ticket : tickets) {
            ticket.printTicket();
        }
    }

    public Ticket findMostExpensive(List<Ticket> tickets) {
        Ticket mostExpensive = null;
        for (Ticket ticket : tickets) {
            if (mostExpensive == null || ticket.finalPrice() > mostExpensive.finalPrice()) {
                mostExpensive = ticket;
            }
        }
        return mostExpensive;
    }

    public void addInvalidTicket(List<Ticket> tickets) {

        try {
            tickets.add(new StudentTicket("S09", "Dune", 90_000, 70));
        } catch (IllegalArgumentException e) {
            System.out.println("[Lỗi]: " + e.getMessage());
        }
        try {
            tickets.add(new Ticket("V09", "Mai", -5));
        } catch (IllegalArgumentException e) {
            System.out.println("[Lỗi]: " + e.getMessage());
        }
    }

    
}
