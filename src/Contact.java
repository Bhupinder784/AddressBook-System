public class Contact {
    String firstName;
    String lastName;
    String city;
    String state;
    long mobileNo;
    String email;

    public Contact(String firstName, String lastName, String city, String state, long mobileNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobileNo=" + mobileNo +
                ", email='" + email + '\'' +
                '}';
    }
}
