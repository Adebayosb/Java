import java.util.Scanner;

public class Triangleandsides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three points for a triangle (x y):");

      System.out.print("Point 1 (x): ");
        double x1 = scanner.nextDouble();
        System.out.print("Point 1 (y): ");
        double y1 = scanner.nextDouble();

        System.out.print("Point 2 (x): ");
        double x2 = scanner.nextDouble();
        System.out.print("Point 2 (y): ");
        double y2 = scanner.nextDouble();

        System.out.print("Point 3 (x): ");
        double x3 = scanner.nextDouble();
        System.out.print("Point 3 (y): ");
        double y3 = scanner.nextDouble();

       
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("The area of the triangle is %.1f%n", area);
    }
}