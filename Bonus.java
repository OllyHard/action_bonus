package bonus;

public class Bonus {
    public static void main(String[] args) {
        int currentBalance = 300;
        int transfer = 1200;
        int bonus = 0;
        if (transfer > 1000) {
            bonus = transfer * 1 / 100;
        }
        int total = currentBalance + transfer + bonus;
        System.out.println(bonus);
        System.out.println(total);
    }
}
