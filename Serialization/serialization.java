import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employees implements Serializable {
    public String id; 
    public transient String password; 
    //biến khai bao với transient sẽ không được serialize
    public String name;
    public int age;
    //Constructor     
    public Employees() {
    }
    //In thông tin
    public void showInfor(){
        System.out.println("ID: "+ this.id);
        System.out.println("Password: "+this.password);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}

public class serialization {   
    public static void serialize(Employees employee){
        try {
            FileOutputStream fileOut = new FileOutputStream("employees.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(employee);

            out.close();
            fileOut.close();
            System.out.println("Save object successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        try {
            FileInputStream fileInput = new FileInputStream("employees.ser");
            ObjectInputStream input = new ObjectInputStream(fileInput);
            //readObject trả về một Object nên cần ép về kiểu Employees
            Employees employee = (Employees) input.readObject();

            System.out.println("Read object from File:");
            employee.showInfor();
        } catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static  void main(String[] args) {
        //Tạo 1 đối tượng và khai báo dữ liệu
        Employees employee = new Employees();
        employee.id = "123456";
        employee.password = "88888888";
        employee.name = "user1";
        employee.age = 21;

        //Serialize bằng hàm serialize() với tham số truyền vào là employee
        serialize(employee);
        //Deserialize bàng hàm Deserialize()
        deserialize();
    }
}
