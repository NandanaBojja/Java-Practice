public class ThrowsExample_Day3 {
    static void checkage(int age){

        if(age<18){
            throw new ArithmeticException("Age must be above 18 for vote eligibility");
        }
        System.out.println("Age is eligible to vote");
        
    }
    public static void main(String[] args) {
        checkage(10);
        System.out.println("Program execution is finished");
    }
}
