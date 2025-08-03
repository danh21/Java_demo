public class Entry {
	public static void main(String[] args) {
        // B21
		/*Person p = new Person(1001, "Quynh", 24, "Ha Noi");
		System.out.println("Id: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Address: " + p.getAddress());*/

        // B22
        /*Rectangle r = new Rectangle(4, 5);
		System.out.println("Area: " + r.getArea());
		System.out.println("Perimeter: " + r.getPerimeter());
		r.setLength(2);
		r.setWidth(3);
		System.out.println("Area: " + r.getArea());
		System.out.println("Perimeter: " + r.getPerimeter());*/

        // B23
        /*Student s = new Student(1001, "Trung", 24, "Ha Noi", 5);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
		System.out.println(s.getScore());
		s.setScore(-7);
		System.out.println(s.getScore());
		s.setScore(15);
		System.out.println(s.getScore());*/

        // B24
        /*Employee e = new Employee(1, "Kien", "Hoang", 1000);
		System.out.println("Id: " + e.getId());
		System.out.println("Name: " + e.getFullName());
		System.out.println("Salary: " + e.getSalary());*/

        // B25
        /*Date d = new Date(1, 1, 1997);
		d.display();
        d.setDate(12, 12, 2004);
		d.display();
		d.setMonth(3);
		d.display();*/

        // B26
        /*Time t = new Time(12, 1, 1);
		t.display();
		t.setTime(23, 59, 59);
		t.display();
		t.nextSecond();
		t.display();
        t.nextSecond();
		t.display();
		t.setTime(7, 0, 0);
		t.display();
		t.previousSecond();
		t.display();*/

        // B27
        /*Point p1 = new Point(1.5, 6.7);
		Point p2 = new Point(2.8, 3.2);
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(2.34, 7.8));*/

        // B28
        Account account1 = new Account(1000, "Tuan", 2000);
		account1.display();
		account1.withdraw(2100);
		account1.deposit(600);
		System.out.println("Balance: " + account1.getBalance());
		account1.withdraw(2100);
		System.out.println("Balance: " + account1.getBalance());
	}
}