package trainapp;

public class Ticket {
    private String from;
    private String to;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private double pricePaid;
    private String section;
    private int seatNumber;

    public Ticket(String from, String to, String userFirstName, String userLastName, String userEmail, double pricePaid, String section, int seatNumber) {
        this.from = from;
        this.to = to;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.pricePaid = pricePaid;
        this.section = section;
        this.seatNumber = seatNumber;
    }

    // Getter methods
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public double getPricePaid() {
        return pricePaid;
    }

    public String getSection() {
        return section;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    // Setter methods
    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setPricePaid(double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
