public class Main {
    public static void main(String[] args) {
        int amount = 10000;
        int start_amount = 0;
        int count_mile = 0;

        count_mile = amount / 20;
        System.out.println("Количество начисленных миль за купленный билет:" + count_mile);

        {
            count_mile = count_mile + 1;
        }
    }
}