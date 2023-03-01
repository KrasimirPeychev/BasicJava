package ConditionalStatements;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // рпи скорост до 10  отпечатваме "slow"
        //при скорост от 10 до 50 отпечатваме "average"
        //при скорост от 50 до 150 отпечатваме "fast"
        //при скорост от 150 до 1000 отпечатваме "ultra fast"
        // при скорост над 1000 отпечатваме "extremely fast"

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 50) {
            System.out.println("average");
        } else if (speed <= 150) {
            System.out.println("fast");
        } else if (speed <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}

