public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Contact contact1 = new Contact("Kavya", "DS", "BLR", "Bizapur", 1234567890l, "kavya@gmail.com");

        Address address = new Address();
        address.add(contact1);
        address.display();
    }
}