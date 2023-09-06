import java.util.*;

public class anagram{
    public static boolean isAnagram(String str1, String str2){

        if(str1.length()!= str2.length()){
            return false;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        if(isAnagram(str1,str2)){
            System.out.println("Anagram Strings");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
