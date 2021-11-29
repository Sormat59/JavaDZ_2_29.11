public class Main {
    public static void main(String[] args) {
        int currentBalance = 1200;
        int replenishment = 100;
        int newBalance = replenishment + currentBalance;
        if (replenishment > 1000) {
            newBalance = replenishment / 100 * 1 + replenishment + currentBalance;
        }
        System.out.println("Баланс = " + newBalance);
    }