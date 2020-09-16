public class bonus {
    public static void main(String[] args) {
        boolean action = true;
        int currentBalance = 300;
        int transfer = 1000;
        int percent;
        if (action) {
            percent = 1;
        } else {
            percent = 0;
        }
        int amount = 1300;
        int bonus = amount * percent / 100;
        int totalBalance = amount + bonus;
        int limit = 1000;
        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);
        System.out.println(totalBalance);
    }
}
