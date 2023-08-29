import Account.Account;
import Account.AccountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AccountManager accountManager = new AccountManager();
        // Add individual and enterprise accounts to accountManager

        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Account loggedInAccount = accountManager.login(email, password);
        if (loggedInAccount != null) {
            ((Account) loggedInAccount).showUserInfo();
            // Other operations...
        } else {
            System.out.println("Login failed.");
        }
    }
}
