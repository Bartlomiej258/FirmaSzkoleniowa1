public class Address {
    private String city;
    private String street;
    private String homeNo;

    public Address(String city, String street, String homeNo) {
        this.city = city;
        this.street = street;
        this.homeNo = homeNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String showAddress(){
        return city + ", " + street + ", " + homeNo;
    }
}
