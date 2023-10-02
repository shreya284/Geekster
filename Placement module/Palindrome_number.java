import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int q = n;
        if(n < 0)
        {
            System.out.println(false);
            return;
        }
        
        int ans = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            ans = ans * 10 + remainder;
            n = n / 10;
        }
        
        if(ans == q)
        {
            System.out.println(true);
        }
        else 
        {
            System.out.println(false);
        }
        
    }
}
