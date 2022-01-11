package day31_CustomClassConstructor;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        account1.setInfo("Ahmet Ozkok", 123456789);

        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(750);
        account1.checkBalance();

        System.out.println("___________________");

        BankAccount account2=new BankAccount();
        account2.setInfo("Emre Kelleci",134265879);
        account2.deposit(10000);
        account2.checkBalance();
    }
}
