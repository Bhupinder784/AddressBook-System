import java.util.ArrayList;

public class Address {
    ArrayList<Contact> al = new ArrayList<Contact>();

    public void add(Contact contact){
        al.add(contact);
    }

    public void display(){
        System.out.println(al);
    }
}
