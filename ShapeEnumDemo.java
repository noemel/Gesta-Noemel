public class ShapeEnumDemo {
    public static void main(String[] args) {
        for (ShapeType shape : ShapeType.values()) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}