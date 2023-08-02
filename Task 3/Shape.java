abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
class ShapeTest{
    public static void main(String[] args) {
        
        Shape shape ;
        
        shape = new Circle(2.2);
        System.out.println("circle = " + shape.calculateArea());

        shape = new Rectangle(5, 8);
        System.out.println("rectangle = " + shape.calculateArea());

        
    }
}