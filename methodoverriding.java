class studentdetail{
    String name;
    int age;

    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class student extends studentdetail {
    @Override
    void display(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        studentdetail sd = new student(); 

        sd.display("Gokul", 20);

        studentdetail s= new studentdetail(); 

        s.display("Gokul", 20);

        
    }
}