import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        int times = 0;
        
        for(int i = 0; i < (int)(A.length() / 2); i++)
        {
            if (A.compareTo(A.substring(i, i+1)) == A.compareTo(A.substring(A.length()-1-i, A.length() - i)))
            {
                times++;
            }
        }
        
        
        if(A.length() % 2 == 0)
        {
            if(times == A.length() / 2)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else
        {
            if(times == (A.length() - 1) / 2)
            {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}


