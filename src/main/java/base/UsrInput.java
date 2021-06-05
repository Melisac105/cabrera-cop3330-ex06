package base;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String input1() {
        System.out.print("What is your current age? ");
        return input.nextLine();
    }

    static public String input2() {
        System.out.print("At what age would you like to retire? ");
        return input.nextLine();
    }
}
