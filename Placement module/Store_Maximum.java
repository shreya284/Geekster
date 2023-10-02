import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] height = new int[n];
        for(int i=0; i < n; i++)
        {
            height[i] = scn.nextInt();
        }
        
        int [] left = new int[n];
        int [] right = new int[n];
        
        left[0] = height[0];
        for(int i=1; i < n; i++)
        {
            left[i] = Math.max(left[i-1],height[i]);
        }
        
        right[n-1] = height[n-1];
        for(int i=n-2; i >= 0; i--)
        {
            right[i] = Math.max(right[i+1],height[i]);
        }
        
        int rainwater = 0;
        for(int i=0; i < n; i++)
        {
            rainwater += (Math.min(left[i],right[i]) - height[i]);
        }
        System.out.println(rainwater);
    }
}
