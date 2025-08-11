package class9;

import java.io.FileOutputStream;

public class Student_Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "kaju";
        s.age = 17;
        String file = ":D/Immersion/output.txt";
        FileOutputStream f = new FileOutputStream(file);
    }
}
class Student {
    String name;
    int age;
    
}
