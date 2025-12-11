import java.util.Scanner;
public class Patterns_Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for your first pattern");
        int num1=sc.nextInt();

        System.out.println("Enter the number for your second pattern ");
        int num2=sc.nextInt();

        for(int i=1;i<=num1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    } 
}
