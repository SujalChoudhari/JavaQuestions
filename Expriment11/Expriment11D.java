package Expriment11;

// WAP to prevent concurrent booking of tickets using thread synchronization.

class TicketBookingApplication  {
   protected int tickets;
   protected int bookedTickets;

    TicketBookingApplication(int tickets) {
         this.tickets = tickets;
         this.bookedTickets = 0;
    }

    public synchronized void bookATicket() {
        if(this.tickets > 0) {
            this.tickets--;
            this.bookedTickets++;
            System.out.println("Ticket booked by " + Thread.currentThread().getName());
            showAvailableTickets();
        } else {
            System.out.println("Sorry "+ Thread.currentThread().getName() +"! No tickets available.");
        }
    }

    public synchronized void showAvailableTickets() {
        System.out.println("Available Tickets: " + this.tickets);
    }
}

class Client extends Thread {
    protected TicketBookingApplication ticketBooking;
    protected int ticketsToBook;

    Client(TicketBookingApplication ticketBooking, int ticketsToBook) {
        this.ticketBooking = ticketBooking;
        this.ticketsToBook = ticketsToBook;
    }

    public void run() {
        for(int i = 0; i < this.ticketsToBook; i++) {
            this.ticketBooking.bookATicket();
        }
    }
}

public class Expriment11D {
    public static void main(String[] args) {
        TicketBookingApplication ticketBooking = new TicketBookingApplication(10);
        Client client1 = new Client(ticketBooking, 5);
        client1.setName("Sujal");
        Client client2 = new Client(ticketBooking, 1);
        client2.setName("Raj");
        Client client3 = new Client(ticketBooking, 5);
        client3.setName("Rahul");

        client1.start();
        client2.start();
        client3.start();
    }
}