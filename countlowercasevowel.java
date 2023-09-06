import java.util.*;

public class countlowercasevowel{

    public static int countLow(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                c++;
            }
        }
        return c;
    }

    public static void main(String args[]){
        System.out.println("Enter the string");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(countLow(str));
    }
}