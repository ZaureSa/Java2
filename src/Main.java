public class Main {
    public static void main(String[] args) {

        int ammount = 400;
        int summ = 1200;


        int bonus;
        if (summ >= 1000) {
            bonus = summ / 100;
        } else {
            bonus = 0;
        }

        int account = ammount + summ + bonus;


        System.out.println("Итоговый счет:" + account);
        System.out.println("Итоговый бонус:" + bonus);
        
    }
}