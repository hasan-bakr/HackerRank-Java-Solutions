import java.util.*;
import java.math.BigInteger;

public class Solution {
    
    public static void func(BigInteger all) {
        
        if(all.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0&& all.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0)
        {
            System.out.println(all + " can be fitted in:");
        }
        
        if(all.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0&& all.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0)
        {
            System.out.println("* byte");
        }
        
        if(all.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0&& all.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0)
        {
            System.out.println("* short");
        }
        
        if(all.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0&& all.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0)
        {
            System.out.println("* int");
        }
        
        if(all.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0&& all.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0)
        {
            System.out.println("* long");
        }
        else
        {
            System.out.println(all + " can't be fitted anywhere.");
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        BigInteger tryes;
        String I;
        
        for(int i = 0; i < times; i++) {
        
            I = sc.next();
            
            tryes = new BigInteger(I);
    
            func(tryes);
            
        }
        
        sc.close();
    }
}