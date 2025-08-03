/*class Student extends Person {
    // B31
	/*private double gpa;
    public Student(String name, int dob, double gpa) {
        super(name, dob);
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }*/

    // B32
    /*private int salary;
    public Student(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }*/

    // B34
    /*private double gpa;
    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    } 
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }*/
    /* 
}*/

// B36
class Student {
    private String name;
    private String address;
    private double gpa;
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
    }
}