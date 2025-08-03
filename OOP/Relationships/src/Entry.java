public class Entry {
    public static void main(String[] args) {
        // B47
		/*Point begin = new Point(1, 1);
		Point end = new Point(2, 2);
		Line line1 = new Line(begin, end);
		System.out.println(line1.getLength());   
		Line line2 = new Line(2, 3, 5, 4);
		System.out.println(line2.getLength());*/

        // B48
        /*Point vertice1 = new Point(1, 3);
		Point vertice2 = new Point(2, 3);
		Point vertice3 = new Point(4, 2);
		Triangle triangle1 = new Triangle(vertice1, vertice2, vertice3);
		Triangle triangle2 = new Triangle(4, 5, 2, 6, 3, 7);
		System.out.println(triangle1.getPerimeter());
		System.out.println(triangle2.getPerimeter());*/

        // B49
        /*Author[] authors = new Author[3];
		authors[0] = new Author("Viet", "VietCV@codelearn.io");
		authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
		authors[2] = new Author("Kien", "KienNT@Codelearn.io");
		Book book1 = new Book("C++ for Beginners", authors, 210000);
		System.out.println(book1.getAuthorNames());*/

        // B50
        /*Customer customer1 = new Customer(1000, "Tuan", 20);
		Invoice invoice1 = new Invoice(1000, customer1, 100000);
		System.out.println("Customer name: " + invoice1.getCustomerName());
		System.out.println("Invoice after discount: " + invoice1.getAmountAfterDiscount());*/

        // B51
        PolyLine polyLine = new PolyLine();
		polyLine.appendPoint(new Point(1, 1));
		polyLine.appendPoint(new Point(2, 3));
		polyLine.appendPoint(3, 0);
		polyLine.appendPoint(4, 2);
		System.out.println(polyLine.getLength());
	}
}
