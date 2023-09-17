import java.util.*;

public class Solution {

    public static class ParalelKenar{
        private int fBreadth, fHeight;
        private static boolean Choose = true;
        public ParalelKenar(int breadth, int height) {
            fBreadth = breadth;
            fHeight = height;
        }
        
        public void controlPositive()
        {
            if(fBreadth <= 0 || fHeight <= 0)
            {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                Choose = false;
            }
        }
        
        public void area()
        {
            if(Choose) {
                int area = 0;
                area = fBreadth * fHeight;
                System.out.println(area);
            }
            
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int height = 0, breadth = 0;
        
        height = sc.nextInt();
        
        breadth = sc.nextInt();
        
        sc.close();
        
        ParalelKenar pr = new ParalelKenar(height, breadth);
        
        pr.controlPositive();
        
        pr.area();
        
        
    }
}