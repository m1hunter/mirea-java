package task1_2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество юаней (целое количество): ");
        int yuan = in.nextInt();
        int digit = yuan % 10;
        double roubles;
        switch (digit) {
            case 1:
                System.out.print("Вы ввели " + yuan + " китайский юань.");
                break;
            case 2 - 4:
                System.out.print("Вы ввели " + yuan + " китайских юаня.");
                break;
            default:
                System.out.print("Вы ввели " + yuan + " китайских юаней.");
                break;
        }
        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.print("\nИтого: " + roubles + " рублей");
        var ans = "";
        ans = String.valueOf(roubles);
        System.out.print("\nИтого: " + ans + " рублей");
        System.out.printf("\n%h", ans);
    }
}