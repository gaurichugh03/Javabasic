import java.util.*;

public class income
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary");
        int salary=sc.nextInt();
        int tax=0;
        if(salary<500000)
        {
            tax=0;
        }
        else if(salary>500000 && salary<1000000)
        {
            tax+= (int)(0.2*salary);
        }
        else 
        {
            tax+=(int)(0.3*salary);
        }
        System.out.println("The tax to be paid is "+tax);

    }
}
