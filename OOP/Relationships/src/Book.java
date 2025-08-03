// B49
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length; i++)
            authorNames += (i == authors.length - 1) ? authors[i].getName() : (authors[i].getName() + ", ");
        return authorNames;
    }
}
