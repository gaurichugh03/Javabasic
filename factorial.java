import java.util.*;

class factorial
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number");
        int n= sc.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print("Factorial is"+ fact);
    }
}