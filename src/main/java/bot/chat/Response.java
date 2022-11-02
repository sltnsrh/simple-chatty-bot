package bot.chat;

import java.util.Scanner;

public class Response {
    private static final String ASSISTANT_NAME = "Max";
    private static final String BIRTH_YEAR = "2020";

    private final Scanner scanner = new Scanner(System.in);

    public void greet() {
        System.out.println("Hello! My name is " + ASSISTANT_NAME + ".");
        System.out.println("I was created in " + BIRTH_YEAR + ".");
        System.out.println("Please, remind me your name.");
    }

    public void remindName() {
        String name = scanner.nextLine();
        while (name.isBlank()) {
            name = scanner.nextLine();
        }
        System.out.println("What a great name you have, " + name + "!");
    }

    public void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder1 = getIntegerFromInput();
        int remainder2 = getIntegerFromInput();
        int remainder3 = getIntegerFromInput();
        int age = (remainder1 * 70 + remainder2 * 21 + remainder3 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    private int getIntegerFromInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please, try again with a numeric symbol: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = getIntegerFromInput();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public void test() {
        System.out.println("Let's test your programming knowledge.");
        int answer = getIntegerFromInput();
        if (answer == 2) {
            end();
        } else {
            System.out.println("Please, try again.");
            test();
        }
    }

    private void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
