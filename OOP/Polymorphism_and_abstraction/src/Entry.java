public class Entry {
    public static void main(String[] args) {
        // B41
		/*Animal[] animals = new Animal[4];
		animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Duck();
		for (int i = 0; i < 4; i++) {
			animals[i].sound();
		}*/

        // B44
        /*Person person1 = new Employee("Trung", "HN", 3300);
		Person person2 = new Customer("Linh", "BN", 10400);
		person1.display();
		person2.display();*/

        // B45
        IShape[] shapes = new IShape[3];
		shapes[0] = new Rectangle(3.4, 5.3);
		shapes[1] = new Circle(5.5);
		shapes[2] = new Rectangle(7.4, 4.3);
		for (int i = 0; i < 3; i++) {
			System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
			System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
		}

        // B46
        // IEmployee employee1 = new PartTimeEmployee("Trung", 45000, 7);
		// System.out.println("Name: " + employee1.getName());
		// System.out.println("Salary per day: " + employee1.calculateSalary());

		// IEmployee employee2 = new FullTimeEmployee("Linh", 65000);
		// System.out.println("Name: " + employee2.getName());
		// System.out.println("Salary per day: " + employee2.calculateSalary());
	}
}