import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        int [] ans = square(arr);//to print the number array based on their square values
        for(int i=0; i < ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
    public static int[] square(int [] arr)
    {
        int n = arr.length;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < n; j++)
            {
                int sq1 = arr[j] * arr[j];
                int sq2 = arr[j-1] * arr[j-1];
                
                if(sq1 < sq2)
                {
                    swap(arr,j,j-1);
                }
            }
        }
        return arr;
    }
    
    public static void swap(int [] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
