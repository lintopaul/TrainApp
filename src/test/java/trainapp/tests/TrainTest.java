package trainapp.tests;

class TrainTest {

    private Train train;

    @BeforeEach
    void setUp() {
        train = new Train();
    }

    @Test
    void testPurchaseTicket() {
        Ticket ticket = train.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20.0, "A");

        assertNotNull(ticket);
        assertEquals("London", ticket.getFrom());
        assertEquals("France", ticket.getTo());
        assertEquals("John", ticket.getUserFirstName());
        assertEquals("Doe", ticket.getUserLastName());
        assertEquals("john.doe@example.com", ticket.getUserEmail());
        assertEquals(20.0, ticket.getPricePaid(), 0.001); // Use delta to allow for precision issues
        assertEquals("A", ticket.getSection());
        assertEquals(1, ticket.getSeatNumber());
    }

    @Test
    void testGetTicket() {
        train.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20.0, "A");
        Ticket ticket = train.getTicket("john.doe@example.com");

        assertNotNull(ticket);
        assertEquals("London", ticket.getFrom());
        assertEquals("France", ticket.getTo());
        assertEquals("John", ticket.getUserFirstName());
        assertEquals("Doe", ticket.getUserLastName());
        assertEquals("john.doe@example.com", ticket.getUserEmail());
        assertEquals(20.0, ticket.getPricePaid(), 0.001); // Use delta to allow for precision issues
        assertEquals("A", ticket.getSection());
        assertEquals(1, ticket.getSeatNumber());
    }

    @Test
    void testGetUsersAndSeats() {
        train.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20.0, "A");
        train.purchaseTicket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20.0, "A");
        train.purchaseTicket("London", "France", "Bob", "Smith", "bob.smith@example.com", 20.0, "B");

        assertEquals(2, train.getUsersAndSeats("A").size());
        assertEquals(1, train.getUsersAndSeats("B").size());
    }

    @Test
    void testRemoveUser() {
        train.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20.0, "A");
        train.purchaseTicket("London", "France", "Jane", "Doe", "jane.doe@example.com", 20.0, "A");

        assertEquals(2, train.getUsersAndSeats("A").size());

        train.removeUser("john.doe@example.com");

        assertEquals(1, train.getUsersAndSeats("A").size());
        assertNull(train.getTicket("john.doe@example.com"));
    }

    @Test
    void testModifyUserSeat() {
        train.purchaseTicket("London", "France", "John", "Doe", "john.doe@example.com", 20.0, "A");
        train.modifyUserSeat("john.doe@example.com", 5);

        assertEquals(5, train.getUsersAndSeats("A").get("john.doe@example.com"));
        assertEquals(5, train.getTicket("john.doe@example.com").getSeatNumber());
    }
}
