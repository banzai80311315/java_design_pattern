package singleton;

public class TicketMaker {
	private static TicketMaker ticketMaker = new TicketMaker();
	private int ticket = 1000;
	
	private TicketMaker() {
		System.out.println("generate instance.");
	}
	
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
	
	public static TicketMaker getTicketMaker() {
		return ticketMaker;
	}
	
}
