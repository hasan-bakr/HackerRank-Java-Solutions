import java.util.Scanner;

public class Solution {

    


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String[] allPiece = new String[s.length() - k + 1];
         
        for(int i = 0; i< s.length() - k + 1 ; i++)
        {
            allPiece[i] = s.substring(i, i + k);
        }

        largest = allPiece[0];
        smallest = allPiece[0];
        
        for(int i = 0; i < allPiece.length - 1; i++) {
            if(allPiece[i].compareTo(largest) > 0) {
                    largest = allPiece[i];
            }
            if(allPiece[i].compareTo(smallest) < 0) {
                    smallest = allPiece[i];
            }
        }
        
        return smallest + "\n" + largest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}