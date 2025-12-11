import java.util.Scanner;

public class PrimeNum_Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if prime or non prime :");

        int num1 = sc.nextInt();
        int count = 0;

        for(int i=1; i<=num1;i++){
            if(num1%i==0){
                count++;
            }
        }
        
        if(count==2){
            System.out.println("Entered number is a Prime number");
        }
        else{
            System.out.println("Entered number is not a Prime number");
        }
        sc.close();
    }
}
