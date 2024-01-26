# TrainApp
TrainApp is a simple Java program that simulates a train ticket booking system. Users can purchase tickets, view receipts, view users and their seats, remove users, and modify user seats.

## Project Structure
```
trainapp
│
├── src
│ ├── main
│ │ └── java
│ │ └── trainapp
│ │ ├── Train.java
│ │ ├── Ticket.java
│ │ └── TrainApp.java
│ │
│ └── test
│ └── java
│ └── trainapp
│ └── tests
│ └── TrainTest.java
│
└── build.gradle
```

## Usage

### Running Tests

To execute the JUnit tests, use the following command:

```
./gradlew test
``````

## Program Overview
- **Ticket.java**: Defines the `Ticket` class representing a train ticket.
- **Train.java**: Defines the `Train` class containing methods for ticket purchase, retrieval, user and seat information, user removal, and seat modification.
- **TrainApp.java**: Contains the `main` method to run the program. It demonstrates the usage of the Train class by purchasing tickets, viewing receipts, and performing other operations.

## Notes
- This is a basic example and does not include extensive error handling or a user interface.
- Make sure to provide valid inputs when interacting with the program.
- Feel free to modify or extend the program based on your requirements.
- Enjoy your train ticket booking experience with TrainApp!