public class StaticVariableExample {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        System.out.println("Number of instances created: " + MyClass.instanceCount); // Output will be 3
    }
}
