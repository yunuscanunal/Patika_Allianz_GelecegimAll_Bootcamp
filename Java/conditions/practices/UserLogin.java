import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        /*
         * homework
         * If the password is wrong, ask the user if she can reset her password, if the
         * user wants to reset it, check that the new password must not be the same as
         * the password she entered incorrectly and forgot, and if the passwords are the
         * same , the screen "Could not create password, please enter another password."
         * If there is no problem, write the program that says "Password created".
         */
        String username, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        username = input.nextLine();

        System.out.print("Enter Password: ");
        password = input.nextLine();

        if (username.equals("admin") && password.equals("123456")) {
            System.out.println("Logged In.");
        } else if (username.equals("admin") && !(password.equals("123456"))) {
            System.out.println("Password Incorrect, Try Again.");
        } else if (!(username.equals("admin")) && password.equals("123456")) {
            System.out.println("Username Incorrect, Try Again.");
        } else {
            System.out.println("Username and Password Incorrect, Try Again.");
        }
    }
}
