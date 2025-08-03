// B19
class Student {
    private String name;
    private char gender;
    public Student() {
        name = "Unknown";
        gender = 'u';
    }
    public Student(String name) {
        this.name = name;
        gender = 'u';
    }
    public Student(char gender) {
        this.gender = gender;
        name = "Unknown";
    }
    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    public void display() {
        System.out.println("Name: " + name);
        switch(gender) {
            case 'm':
                System.out.println("Gender: Male");
                break;
            case 'f':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Gender: Unknown");
                break;
        }
    }
}
