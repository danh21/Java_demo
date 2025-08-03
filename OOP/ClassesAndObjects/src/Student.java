//import java.util.Scanner;
class Student {
    // B8
	/*private String name;
    private int age;
    public Student() {
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
    }*/

    // B9
    /*private String name;
    private int age;
    private String gender;
    private double gpa;
    public Student(String name, int age, String gender, double gpa) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
    }*/

    // B11
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}