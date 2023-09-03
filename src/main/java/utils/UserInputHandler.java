package utils;

import java.util.Scanner;

public class UserInputHandler {

    static private Scanner scanner = new Scanner(System.in);

    public static MenuOptions getMenuOptionFromUser() {
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];
    }

    private static int getIntegerFromUser() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Value provided not correct. Provide an integer.");
        }
        return scanner.nextInt();
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();
        if(result > 0 && result < MenuOptions.values().length + 1) {
            return result;
        } else {
            System.out.println("You've provided incorrect value");
            return getSelectedOptionFromUser();
        }
    }
}
