package Expriment11;

// WAP to prevent concurrent booking of tickets using thread synchronization.

class Server {

  protected int tickets;
  protected int bookedTickets;

  Server(int tickets) {
    this.tickets = tickets;
    this.bookedTickets = 0;
  }

  public synchronized void book(int n) {
    if (this.tickets < n) {
      System.out.println(
        "Sorry " +
        Thread.currentThread().getName() +
        ". Only " +
        this.tickets +
        " tickets available."
      );
    } else {
      System.out.println(
        n + " tickets booked by " + Thread.currentThread().getName()
      );
      this.tickets -= n;
    }
  }

  public synchronized void showAvailableTickets() {
    System.out.println("Available Tickets: " + this.tickets);
  }
}

class Client extends Thread {

  protected Server ticketBooking;
  protected int ticketsToBook;

  Client(Server ticketBooking, int ticketsToBook) {
    this.ticketBooking = ticketBooking;
    this.ticketsToBook = ticketsToBook;
  }

  public void run() {
    this.ticketBooking.book(this.ticketsToBook);
  }
}

public class Expriment11D {

  public static void main(String[] args) {
    Server server = new Server(10);
    Client client1 = new Client(server, 7);
    client1.setName("Sujal");
    Client client2 = new Client(server, 3);
    client2.setName("Raj");
    Client client3 = new Client(server, 2);
    client3.setName("Rahul");

    client1.start();
    client2.start();
    client3.start();
  }
}
