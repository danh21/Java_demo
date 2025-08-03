// B44
/*public class Employee extends Person{
    private int salary;
    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display() {
        System.out.println("Employee name: " + getName());
        System.out.println("Employee address: " + getAddress());
        System.out.println("Employee salary: " + salary);
    }
}*/

// B46
abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
}