public class Main {
    public static void main(String[] args) {
        int currentBalance = 300;
        int replenishment = 2013;
        int newBalance = replenishment + currentBalance;
        if (replenishment > 1000) {
            newBalance = replenishment / 100 * 1 + replenishment + currentBalance;
        }
        System.out.println("Ваш Баланс = " + newBalance);
    }
}