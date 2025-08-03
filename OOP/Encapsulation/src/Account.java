// B28
public class Account {
    private int id, balance = 0;
    private String name;
    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("That amount exceeds your current balance.");
    }
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
