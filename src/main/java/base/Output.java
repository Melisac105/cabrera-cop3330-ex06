package base;

public class Output {

    static public void printOutput(int yearLeft, int currentYear, int retirementYear) {
        System.out.format("You have %d years left until you can retire.\n", yearLeft);
        System.out.format("It's %d, so you can retire in %d.\n", currentYear, retirementYear);
    }
}
