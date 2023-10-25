public class StaticMethodExample {
    public static void main(String[] args) {
        double[] values = { 5.0, 10.0, 15.0, 20.0, 25.0 };

        double average = MathOperations.calculateAverage(values);

        System.out.println("Average: " + average); // Output will be 15.0
    }
}