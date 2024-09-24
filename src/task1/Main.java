package task1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        double roubles;
        int yuan; //
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество юаней (целое количество): ");
        yuan = in.nextInt();
        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.print("По курсу 11.91 Вы получите " + roubles + " юаней");
    }
}