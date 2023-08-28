package problem1;

import java.util.Scanner;

public class NumericRunner {
    public static void main(String[]args)
    {
        Numeric object=new Numeric();
        Scanner in=new Scanner(System.in);
        Double Number,Power;
        Number=in.nextDouble();
        Power=in.nextDouble();
        System.out.println(object.intPower(Number,Power));
    }

}
