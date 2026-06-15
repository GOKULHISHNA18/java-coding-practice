interface Shape {
    double PI = 3.14; // public static final by default

    void displayArea();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea() {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class interfacee {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayArea();

        System.out.println("Value of PI: " + Shape.PI);
    }
}