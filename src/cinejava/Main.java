package cinejava;

import java.util.ArrayList;

import cinejava.service.TicketService;

public class Main {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        ticketService.createSampleTicket();
        System.out.println("Danh sách vé xem phim:");
        ticketService.printTicketList(ticketService.createSampleTicket());
        System.out.println("\nVé xem phim có giá cao nhất:");
        ticketService.findMostExpensive(ticketService.createSampleTicket()).printTicket();
        System.out.println("\nThêm vé xem phim không hợp lệ:");
        ticketService.addInvalidTicket(ticketService.createSampleTicket());
    
        
    }
}
