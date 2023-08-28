package problem1;

public class Numeric {
    public static double intPower(double x,double n)
    {
        double result=0;
        if(n<0)
        {
            result=1/Math.pow(x,n);

            return result;
        }
        else if(n>0&&n%2==0)
        {
            result=Math.pow((Math.pow(x,n)/2),2);
            return result;
        }
        else
        {
            result=Math.pow(x,n-1)*x;
            return result;
        }
    }
}
