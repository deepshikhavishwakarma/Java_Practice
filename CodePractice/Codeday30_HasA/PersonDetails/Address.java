package CodePractice.Codeday30_HasA.PersonDetails;

public class Address {
    String streetName;
    String state;
    String city;
    long pinCode;

    public Address(String streetName, String state, String city, long pinCode) {
        this.streetName = streetName;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "streetName='" + streetName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
