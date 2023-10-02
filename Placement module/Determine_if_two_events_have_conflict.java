import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String [] arr1 = new String[2];//string arr1 for meeting-1 time
        String [] arr2 = new String[2];//string arr2 for meeting-2 time
        
        arr1[0] = scn.next();//starting time for meeting 1
        arr1[1] = scn.next();//ending time for meeting 1
        
        arr2[0] = scn.next();//starting time for meeting 2
        arr2[1] = scn.next();//ending time for meeting 2
        
        String s1 = arr1[1];
        String s2 = arr2[0];
        
        int meetingTime1 = 0;
        int hh1 = (s1.charAt(0) - '0') * 10 + (s1.charAt(1) - '0');
        int mm1 = (s1.charAt(3) - '0') * 10 + (s1.charAt(4) - '0');
        meetingTime1 = hh1 * 60 + mm1;
        
        int meetingTime2 = 0;
        int hh2 = (s2.charAt(0) - '0') * 10 + (s2.charAt(1) - '0');
        int mm2 = (s2.charAt(3) - '0') * 10 + (s2.charAt(4) - '0');
        meetingTime2 = hh2 * 60 + mm2;
        
        if(meetingTime1 < meetingTime2)
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }
        
    }
}
