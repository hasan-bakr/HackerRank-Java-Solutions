import java.util.Scanner;

public class Solution {
private static String[][] ArraysSort(String[][] charLists){
        for (int i = 0; i < charLists[0].length - 1; i++) {
            for (int j = 0; j < charLists[0].length - i - 1; j++) {
                if (charLists[0][j].compareTo(charLists[0][j + 1]) > 0) {
                    
                    String temp = charLists[0][j];
                    charLists[0][j] = charLists[0][j + 1];
                    charLists[0][j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < charLists[1].length - 1; i++) {
            for (int j = 0; j < charLists[1].length - i - 1; j++) {
                if (charLists[1][j].compareTo(charLists[1][j + 1]) > 0) {
                    
                    String temp = charLists[1][j];
                    charLists[1][j] = charLists[1][j + 1];
                    charLists[1][j + 1] = temp;
                }
            }
        }
        
        return charLists;
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.length() != b.length()) {
            return false;
        }
        
        String[][] charLists = new String[2][a.length()];
        
        for(int i = 0; i < a.length(); i++) {
            charLists[0][i] = a.substring(i, i+1);
            charLists[1][i] = b.substring(i, i+1);
            
        }
        
        charLists = ArraysSort(charLists);
        
        
        
        for(int i = 0; i < a.length(); i++) {
            if(charLists[0][i].compareTo(charLists[1][i]) != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}