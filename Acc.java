class BankAccount {
    public String name;
    private String password;
    public void setPassword(String paswd) {
        password = paswd;
    }
}
public class Acc {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Abhishek";
        System.out.println(myAcc.name);
        myAcc.setPassword("paswfj");
    }
}
