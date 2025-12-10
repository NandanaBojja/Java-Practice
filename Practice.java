class Practice
{
    int car1 = 150000;
    int car2 = 200000;
    int car3 = 400000;

    public void price()
    {
        System.out.println("Price of car 1: " + car1);
        System.out.println("Price of car 2: " + car2);
        System.out.println("Price of car 3: " + car3);
    }

    public static void main(String[] args)
    {
        Practice obj = new Practice();
        obj.price();
    }
}
