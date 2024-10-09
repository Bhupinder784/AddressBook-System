import java.util.HashMap;

public class AddressBookSystem {
    private static HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();

    public void addAddressBook(String name){
        if(addressBookHashMap.containsKey(name)){
            System.out.println("An Address Book with this name already exists.");
        }else{
            addressBookHashMap.put(name, new AddressBook());
            System.out.println("Address Book '" + name + "' created successfully.");
        }
    }

    public void displayAllAddressBooks() {
        if (addressBookHashMap.isEmpty()) {
            System.out.println("No Address Books available.");
        } else {
            System.out.println("Available Address Books:");
            for (String name : addressBookHashMap.keySet()) {
                System.out.println("- " + name);
            }
        }
    }
}
