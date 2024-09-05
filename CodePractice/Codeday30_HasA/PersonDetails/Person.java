package CodePractice.Codeday30_HasA.PersonDetails;

public class Person {
    String name;
    int age;
    Address address;//Has A relationShip

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
