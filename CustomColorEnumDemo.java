public class CustomColorEnumDemo {
    public static void main(String[] args) {
        for (CustomColor color : CustomColor.values()) {
            System.out.println(color + ": " + color.getRGBValues());
        }
    }
}