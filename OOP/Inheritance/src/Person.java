class Person {
    // B31
	/*private String name;
	private int dob;
	public Person(String name, int dob) {
		this.name = name;
		this.dob = dob;
	}
	public String getName() {
        return name;
    } 
    public int getDob() {
        return dob;
    }*/

    // B32
    /*private String name;
	private String gender;
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
	}*/

    // B34
    private String name, address;
    private int age;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}