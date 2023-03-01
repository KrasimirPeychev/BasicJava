package ConditionalStatements;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитаме текст=парола
        //проверка при = welcome при различно - wrong password

        String password = scanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }


    }
}