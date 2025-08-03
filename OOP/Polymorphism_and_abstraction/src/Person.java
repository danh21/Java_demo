// B44
abstract class Person {
    private String name, address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public abstract void display(); 
}
