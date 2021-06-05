package base;

import java.time.Year;

public class GetYear {

    static public int currentYear(){
        return Year.now().getValue();
    }

    static public int calculateYearsLeft(int in1, int in2) {
        return in2 - in1;
    }

    static public int retirementYear(int in1, int in2) {
        return in1 + in2;
    }
}
