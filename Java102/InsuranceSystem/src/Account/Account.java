package Account;

import Insurance.Insurance;


public abstract class Account implements Comparable<Account> {
    private User user;

    public Account(User user) {
        super();
        this.user = user;

    }

    public final void showUserInfo() {
        System.out.println("--------------Müşteri Bilgileri-------------");
        System.out.println("Name : " + user.getName());
        System.out.println("Surname : " + user.getSurname());
        System.out.println("E-Mail : " + user.getEmail());
        System.out.println("Age : " + user.getAge());
        System.out.println("Job : " + user.getJob());
        System.out.println();
        System.out.println("---------------Address List------------------");
        for (int i = 0; i < user.getAddressList().size(); i++) {
            System.out.print((i + 1) + ". address : ");
            System.out.print(user.getAddressList().get(i).getNeighborhood() + ", " + user.getAddressList().get(i).getStreet()
                    + ", " + user.getAddressList().get(i).getTown() + ", " + user.getAddressList().get(i).getCity() + ", " + user.getAddressList().get(i).getCountry() + "\n");
        }
        System.out.println("---------------------------------------------");

        System.out.println("\n---------------Insurance List----------------");
        for (Insurance s : user.getInsurances()) {
            System.out.println("Type of Insurance : " + s.getClass().getSimpleName());
            System.out.println("Price of Insurance : " + s.calculate());
            System.out.println("Start date : " + s.getStartDate());
            System.out.println("Finish date : " + s.getFinishDate());
            System.out.println();
        }


    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}