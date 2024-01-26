package trainapp;
import java.util.HashMap;
import java.util.Map;

public class Train {
    private Map<String, Ticket> tickets = new HashMap<>();
    private Map<String, Integer> sectionSeatsA = new HashMap<>();
    private Map<String, Integer> sectionSeatsB = new HashMap<>();
    private int nextSeatA = 1;
    private int nextSeatB = 1;

    public Ticket purchaseTicket(String from, String to, String userFirstName, String userLastName, String userEmail, double pricePaid, String section) {
        int seatNumber;
        if (section.equals("A")) {
            seatNumber = nextSeatA++;
        } else if (section.equals("B")) {
            seatNumber = nextSeatB++;
        } else {
            throw new IllegalArgumentException("Invalid section specified");
        }

        Ticket ticket = new Ticket(from, to, userFirstName, userLastName, userEmail, pricePaid, section, seatNumber);
        tickets.put(userEmail, ticket);

        if (section.equals("A")) {
            sectionSeatsA.put(userEmail, seatNumber);
        } else if (section.equals("B")) {
            sectionSeatsB.put(userEmail, seatNumber);
        }

        return ticket;
    }

    public Ticket getTicket(String userEmail) {
        return tickets.get(userEmail);
    }

    public Map<String, Integer> getUsersAndSeats(String section) {
        return (section.equals("A")) ? sectionSeatsA : sectionSeatsB;
    }

    public void removeUser(String userEmail) {
        Ticket removedTicket = tickets.remove(userEmail);
        if (removedTicket != null) {
            if (removedTicket.getSection() == "A") {
                sectionSeatsA.remove(userEmail);
            } else if (removedTicket.getSection() == "B") {
                sectionSeatsB.remove(userEmail);
            }
        }
    }

    public void modifyUserSeat(String userEmail, int newSeatNumber) {
        Ticket ticket = tickets.get(userEmail);
        if (ticket != null) {
            if (ticket.getSection() == "A") {
                sectionSeatsA.put(userEmail, newSeatNumber);
            } else if (ticket.getSection() == "B") {
                sectionSeatsB.put(userEmail, newSeatNumber);
            }
            ticket.setSeatNumber(newSeatNumber);
        }
    }
}
