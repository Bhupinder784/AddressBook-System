import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> al = new ArrayList<Contact>();
    private static AddressBook addressBook = new AddressBook();

    public void add(Contact contact){
        al.add(contact);
    }

    public void display(){
        System.out.println(al);
    }

    public Contact findContact(String firstName, String lastName) {
        for (Contact contact : al) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {
                return contact;
            }
        }
        return null;
    }

    public boolean editContact(String firstName, String lastName, Contact updatedContact) {
        Contact existingContact = findContact(firstName, lastName);
        if (existingContact != null) {
            existingContact.setFirstName(updatedContact.firstName);
            existingContact.setLastName(updatedContact.lastName);
            existingContact.setCity(updatedContact.city);
            existingContact.setState(updatedContact.state);
            existingContact.setMobileNo(updatedContact.mobileNo);
            existingContact.setEmail(updatedContact.email);
            return true;
        }
        return false;
    }
}
