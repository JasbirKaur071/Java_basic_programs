//checking the number palindrome or not
import java.util.*;
public class palindrome{
    public static void main (String[]args){
        int a=121;
        int b=a;//storing in other variable to preserve the original value 
        int rev=0;
        while(a>0){
            int digit=a%10;
            rev= rev*10 + digit;
            a/=10;
        }
        if(rev==b){
            System.out.println(b+" is a palindrome");
        }else{
            System.out.println(b+" is not a palindrome");
        }
    
        
        
    }
    

}
