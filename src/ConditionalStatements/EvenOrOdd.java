package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитам цяло число
        //акое е четно - even/odd

        int number = Integer.parseInt(scanner.nextLine());
        //  четно може да се раздели на 2 с ост. 0
        //нечетно не може да се раздели с ост. 0
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println(number);
        }
    }
}

