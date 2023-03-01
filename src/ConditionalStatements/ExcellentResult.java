package ConditionalStatements;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        // proìtame cqlo 4islo
        //ptowerka dali ocenkata >= 5 - "excellent"

        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());
        if (grade >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent!");
        }
    }
}
