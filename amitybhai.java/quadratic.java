import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: \n");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real solutions.");
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            System.out.println("Solutions: " + root1 + (discriminant > 0 ? " and " + root2 : ""));
        }
        sc.close();
    }
}
5