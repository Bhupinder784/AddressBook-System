import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static AddressBook addressBook = new AddressBook();
    private static AddressBookSystem addressBookSystem = new AddressBookSystem();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n--- Address Book System Menu ---");
            System.out.println("1. Add new Contact to Address Book");
            System.out.println("2. Edit existing contact");
            System.out.println("3. delete existing contact");
            System.out.println("4. Display all contacts");

            System.out.println("5. Add new Address Book");
            System.out.println("6. Display all Address Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    editExistingContact();
                    break;
                case 3:
                    deleteExistingContact();
                    break;
                case 4:
                    addressBook.display();
                    break;
                case 5:
                    System.out.println("Enter the name of the new Address Book:");
                    String newAddressBookName = scanner.nextLine();
                    addressBookSystem.addAddressBook(newAddressBookName);
                    break;
                case 6:
                    addressBookSystem.displayAllAddressBooks();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting Address Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    running = false;
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
        long phoneNumber = scanner.nextLong();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(firstName, lastName, city, state, phoneNumber, email);
        addressBook.add(newContact);
        System.out.println("Contact added successfully!");
    }

    private static void editExistingContact() {
        System.out.println("\nEnter the name of the contact to edit:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        Contact existingContact = addressBook.findContact(firstName, lastName);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Current details: " + existingContact);
        System.out.println("Enter new details:");
        Contact updatedContact = readContactDetails();

        boolean success = addressBook.editContact(firstName, lastName, updatedContact);
        if (success) {
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Failed to update contact.");
        }
    }

    private static void deleteExistingContact(){
        System.out.println("\nEnter the name of the contact to edit:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        Contact existingContact = addressBook.findContact(firstName, lastName);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        boolean success = addressBook.deleteContact(firstName, lastName);
        if (success) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Failed to delete contact.");
        }
    }


    private static Contact readContactDetails() {
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

        return new Contact(firstName, lastName, city, state, phoneNumber, email);
    }
}