public class ExceptionHandling_Day3 {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4};
        try {
            System.out.println(numbers[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessed index doesnt exist"+e);
        }
        finally{
            System.out.println("Thank you for execution");
        }
        System.out.println("Execution completed !");
    }
}
