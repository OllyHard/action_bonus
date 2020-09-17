package bonus;

public class Bonus {
    public static void main(String[] args) {
        boolean action = true;
        int currentBalance = 300;
        int transfer = 1200;
        int percent;
        if (action) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = transfer * percent / 100;
        int limit = 1000;
        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);
    }
}
