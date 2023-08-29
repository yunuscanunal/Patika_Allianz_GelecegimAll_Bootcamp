package Address;


public class AddressManager {
    public static void addAddress(User user, Address address) {
        user.addAddress(address);

    }

    public static void removeAddress(User user, Address address) {
        user.removeAddress(address);
    }
}
