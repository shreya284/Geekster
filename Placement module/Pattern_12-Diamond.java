import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int i,j;
        int sp = n - 1;
        int st = 1;
        
        for(i=1; i<=2*n-1; i++)
        {
            //for spaces
            for(j=1; j<=sp; j++)
            {
                System.out.print(" ");
            }
            
            //for stars
            for(j=1; j<=st; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        
            if(i < n){
                sp -= 1;
                st += 2;
            }
            else{
                sp += 1;
                st -= 2;
            }
        }
    }
}
