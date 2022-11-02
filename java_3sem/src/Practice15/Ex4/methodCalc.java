package Practice15.Ex4;

public class methodCalc
{
    public double calc ( double n1, String op, double n2)
    {
        double res = 0;
        switch (op)
        {
            case "+":
                res = n1+n2;
                break;
            case "-":
                res = n1-n2;
                break;
            case "*":
                res = n1*n2;
                break;
            case "/":
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}