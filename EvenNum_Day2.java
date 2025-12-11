import java.util.Scanner;

public class EvenNum_Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number to check if even or odd : ");

        int num1=sc.nextInt();

        if(num1%2==0){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
        sc.close();
    }
}
