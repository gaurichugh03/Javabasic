import java.util.Scanner;

public class evenoddsum
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        int i;
        int choice;
        do{
            System.out.println("Enter number");
            i= sc.nextInt();
            if(i%2==0)
            {
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
            System.out.println("press one to continue");
            choice= sc.nextInt();
        } while(choice==1);
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
