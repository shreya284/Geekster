import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int stars = n;
        for(int i=1; i <= n; i++)
        {
            for(int j=1; j <= stars; j++)
            {
                System.out.print(j+" ");
            }
            
            stars--;
            System.out.println();
        }
        
    }
}
