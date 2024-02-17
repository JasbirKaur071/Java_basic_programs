//the file name shoube same as the class name
//basic program to print the fibonacci series for the given input
import java.util.*;
public class fibo{
    public static void main(String[]args){
        int n=10;
        int n1;
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        for(int i=2; i<=n; i++){
            n1=first+second;
            System.out.print(n+" ");
            first=second;
            second=n1;
        }
    }
}
