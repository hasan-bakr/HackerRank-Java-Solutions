import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       
       String A = sc.next();
       String B = sc.next();
       
       int len = A.length() + B.length();
       int result = A.compareTo(B);
       String yesNo = "Yes";
       if (result <= 0) {
           yesNo = "No";
       }
       
       A = A.substring(0, 1).toUpperCase() + A.substring(1);
       B = B.substring(0, 1).toUpperCase() + B.substring(1);
       
       System.out.println(len);
       System.out.println(yesNo);
       System.out.println(A + " " + B);
       
       sc.close();
    }
}