/*
    Encapsulation: Hiding internal data of a class using access modifiers and exposing it only through getters and setters.
*/

package J05_OOPs_Programs_Encapsulation;

public class EC01_Program {
    public static void main(String[] args) {

        VWOLogin login = new VWOLogin("admin", "pwd123");

        System.out.println("\n------------------------- OLD CREDENTIALS -------------------------");

        System.out.println(login.getUsername());

        System.out.println(login.getPassword());

        System.out.println("\n------------------------- SET NEW CREDENTIALS -------------------------");

        login.setUsername("sushma");
        System.out.println(login.getUsername());

        boolean isAdmin = true;

        login.setPassword("123", false);

        System.out.println(login.getPassword());

    }
}


class VWOLogin {

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not Allowed to Change Password");
        }
    }

    public VWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
}