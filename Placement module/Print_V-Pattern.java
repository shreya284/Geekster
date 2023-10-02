import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//n=5
        
        int columns = n;//columns=5
        int rows = n/2 + 1;//rows= 5/2 + 1 = 2 + 1 = 3
        
        int start = 1;
        int end = n;//end=5
        
        for(int i=1; i <= rows; i++)//for rows
        {
            for(int j=1; j <= columns; j++)//for cols
            {
                if(start == j || end == j)//
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
            start++;
            end--;
        }
        
    }
}
