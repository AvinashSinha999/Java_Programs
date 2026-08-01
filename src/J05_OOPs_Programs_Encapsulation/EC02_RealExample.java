/*
    Encapsulation: Hiding internal data of a class using access modifiers and exposing it only through getters and setters.
*/

package J05_OOPs_Programs_Encapsulation;

public class EC02_RealExample {
    public static void main(String[] args) {

        ICICIBank avi = new ICICIBank("avi", 1000);
        System.out.println(avi.getBal());

        boolean isCashier = true;

        avi.setBal(5000, isCashier);
        System.out.println(avi.getBal());
        System.out.println(avi.bank_name);

    }
}


class ICICIBank {

    private String name;
    private long bal;
    public String bank_name = "ICICI";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Balance");
        }
    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
}