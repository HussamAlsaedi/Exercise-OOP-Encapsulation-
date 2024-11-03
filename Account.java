public class Account
{
    private String ID;
    private String name;
    private int balance;

    Account(){

    }

    Account(String ID, String name, int balance)
    {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public  int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for debit operation.");
        }
        return balance;
    }

    public  int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
        return balance;
    }
}
