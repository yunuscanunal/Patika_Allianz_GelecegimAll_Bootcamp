package Address;

public class BusinessAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public BusinessAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddressType() {
        return "Business Address";
    }

    @Override
    public String getAddressInfo() {
        return "Street: " + street + ", City: " + city + ", Postal Code: " + postalCode;
    }
}
