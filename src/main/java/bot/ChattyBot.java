package bot;

import java.util.Scanner;

public class ChattyBot {
    final static Scanner scanner = new Scanner(System.in);
    final static String assistantName = "Max";
    final static String birthYear = "2020";

    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        test();
    }

    static void greet() {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        while (name.isBlank()) {
            name = scanner.nextLine();
        }
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder1 = getIntegerFromInput();
        int remainder2 = getIntegerFromInput();
        int remainder3 = getIntegerFromInput();
        int age = (remainder1 * 70 + remainder2 * 21 + remainder3 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static int getIntegerFromInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please, try again with a numeric symbol: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = getIntegerFromInput();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        int answer = getIntegerFromInput();
        if (answer == 2) {
            end();
        } else {
            System.out.println("Please, try again.");
            test();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
