package trainapp;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {
        Train train = new Train();

        // Purchase Ticket
        Ticket ticket1 = train.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20.0, "A");
        System.out.println("Ticket purchased: " + ticket1.getUserFirstName() + " " + ticket1.getUserLastName());

        // View Receipt
        Ticket receipt = train.getTicket("john.doe@example.com");
        System.out.println("Receipt: " + receipt.getFrom() + " to " + receipt.getTo() + ", Price Paid: $" + receipt.getPricePaid());

        // View Users and Seats in Section A
        Map<String, Integer> usersAndSeatsA = train.getUsersAndSeats("A");
        System.out.println("Users and Seats in Section A: " + usersAndSeatsA);

        // Remove User
        train.removeUser("john.doe@example.com");
        System.out.println("User removed");

        // Modify User's Seat
        train.purchaseTicket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20.0, "A");
        train.modifyUserSeat("jane.doe@example.com", 5);
        System.out.println("User's seat modified");

        // View Updated Users and Seats in Section A
        usersAndSeatsA = train.getUsersAndSeats("A");
        System.out.println("Updated Users and Seats in Section A: " + usersAndSeatsA);
    }
}
