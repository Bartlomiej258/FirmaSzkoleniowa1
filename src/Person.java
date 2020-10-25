public class Person {
    private String firstName;
    private String lastName;
    Address address;
    String groupClasses;


    public Person(String firstName, String lastName, Address address, String groupClasses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.groupClasses = groupClasses;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGroupClasses() {
        return groupClasses;
    }

    public void setGroupClasses(String groupClasses) {
        this.groupClasses = groupClasses;
    }

    void printInfo(){
        System.out.println(firstName + lastName + ", " + address.showAddress());
    }
}
