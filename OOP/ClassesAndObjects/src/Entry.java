import java.util.Scanner;

// B3
class Rectangle{
	double length;
    double width;
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public void display() {
        System.out.println("Area: " + getArea(length, width));
        System.out.println("Perimeter: " + getPerimeter(length, width));
    }
    public double getArea(double a, double b) {
        return a * b;
    }  
    public double getPerimeter(double a, double b) {
        return (a + b) * 2;
    }
}

// B6
class Student{
	String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Entry {
	public static void main(String[]args) {
        // B2
		/*Student s1 = new Student();
		s1.getInformation();
		s1.display();*/

        // B3
        /*Rectangle r = new Rectangle();
		r.getInformation();
		r.display();*/

        // B6
        /*Student s1 = new Student("Long", 24);
		Student s2 = new Student("Kien", 29);
		s1.display();
		s2.display();*/

        // B10
        Circle c = new Circle(7);
		System.out.println(c.getArea());
		System.out.println(c.getCircumference());

        // B11
        // Student[] students = new Student[3];
		// students[0] = new Student("Tuan", 24);
        // students[1] = new Student("Cuong", 25);
        // students[2] = new Student("Duc", 24);
		// for (int i = 0; i < 3; i++) {
		// 	students[i].display();
		// }
	}
}
