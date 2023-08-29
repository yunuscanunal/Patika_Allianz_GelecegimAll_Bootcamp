package Address;

public class HomeAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public HomeAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddressType() {
        return "Home Address";
    }

    @Override
    public String getAddressInfo() {
        return "Street: " + street + ", City: " + city + ", Postal Code: " + postalCode;
    }
}
