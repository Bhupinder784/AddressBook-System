import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    addressBook.display();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Address Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();

//        System.out.println("Welcome to Address Book");
//        Contact contact1 = new Contact("Kavya", "DS", "BLR", "Bizapur", 1234567890l, "kavya@gmail.com");
//
//        Address address = new Address();
//        address.add(contact1);
//        address.display();
    }

    private static void addNewContact() {
        System.out.println("\nEnter contact details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("City Name: ");
        String city = scanner.nextLine();

        System.out.print("State Name: ");
        String state = scanner.nextLine();

        System.out.print("Phone Number: ");
        long phoneNumber = scanner.nextInt();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(firstName, lastName, city, state, phoneNumber, email);
        addressBook.add(newContact);
        System.out.println("Contact added successfully!");
    }
}