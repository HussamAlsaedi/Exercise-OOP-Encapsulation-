//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // class Account ---------------

        Account account = new Account("1098","hussam",2409);
        Account account2 = new Account("10202", "Receiver", 1500);
        System.out.println("---------- Account ------------");
        account.credit(5000);
        account.debit(200);
        System.out.println(account.getBalance());
        System.out.println(account.getName());
        System.out.println(account.getBalance());
        account.transferTo(account2,49);
        System.out.println("Balance after transfer from account1: " + account.getBalance());
        System.out.println("Balance of account2 after receiving transfer: " + account2.getBalance());




        // class Employee -------------
        System.out.println("---------- Employee ------------");
        Employee hussam = new Employee(1000,"alsaedi",1000);
        hussam.raisedSalary(10);
        System.out.println("Employee ID: "+hussam.getID());
        System.out.println("Employee name: "+hussam.getName());
        System.out.println("Employee salary: "+hussam.getSalary());
        System.out.print("Employee Annual Salary: "); hussam.getAnnualSalary();



    }
}