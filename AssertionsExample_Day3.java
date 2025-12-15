public class AssertionsExample_Day3 {
    public static void main(String[] args) {
        int age = 7;
        assert age < 18 : "Not eligible to vote";
        System.out.println("The voter's age is " +age);
    }
}
