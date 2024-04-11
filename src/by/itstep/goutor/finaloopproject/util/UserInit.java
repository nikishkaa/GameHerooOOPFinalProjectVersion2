package by.itstep.goutor.finaloopproject.util;

import by.itstep.goutor.finaloopproject.view.Printer;

import java.util.Scanner;

public class UserInit {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getMagicDamage() {
        Printer.print("Enter magic damage ");
        return SCANNER.nextInt();
    }

    public static int getKnightDamage() {
        Printer.print("Enter knight damage ");
        return SCANNER.nextInt();
    }
}
