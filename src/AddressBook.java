import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> al = new ArrayList<Contact>();

    public void add(Contact contact){
        al.add(contact);
    }

    public void display(){
        System.out.println(al);
    }
}
