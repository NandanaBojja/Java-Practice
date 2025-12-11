import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of your rectangle : ");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of your rectangle : ");
        double breadth = sc.nextDouble();

        double area = 2 * (length + breadth);
        System.out.println("The calculated area is : "+area);
        sc.close();
    }
    
}
