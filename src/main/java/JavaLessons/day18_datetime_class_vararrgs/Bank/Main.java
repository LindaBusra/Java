package JavaLessons.day18_datetime_class_vararrgs.Bank;

public class Main {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount("Wonder Woman", 1000);

        bankAccount.withDraw(500);
        bankAccount.deposit(5000);
        bankAccount.withDraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
