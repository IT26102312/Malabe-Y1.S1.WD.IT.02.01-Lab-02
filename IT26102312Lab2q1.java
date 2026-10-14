public class Lab2Q1 {
    public static void main(String[] args) {

        double perimeter = 100;
        double length;
        double width;

        // Width is 3/4 of the length
        width = (3.0 / 4.0) * 0; // Placeholder
        length = perimeter / 2.0;

        // Calculate length and width
        length = perimeter / (2 * (1 + 3.0 / 4.0));
        width = (3.0 / 4.0) * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}
