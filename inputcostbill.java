import java.util.*;

public class inputcostbill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of pencil");
        float a = sc.nextFloat();
        System.out.println("Enter cost of pen");
        float b = sc.nextFloat();
        System.out.println("Enter cost of eraser");
        float c = sc.nextFloat();
        float cost= a+b+c;
        double totalbill= cost + (0.18*cost);
        System.out.println("Your total bill after gst is "+totalbill);
    }
}