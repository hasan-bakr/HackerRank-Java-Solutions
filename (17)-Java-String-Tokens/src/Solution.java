import java.util.*;

public class Solution {

    public static String[] regexx(String[] words, String regex) {
        
        ArrayList<String> arrList = new ArrayList<>();
        
        
        for(int i = 0; i < words.length; i++) {// length = 2, i 0 1
            
            String[] casual =  words[i].split(regex);    
            for(int m = 0; m < casual.length; m++) {
                arrList.add(casual[m]);
            }
            
        }
        
        
        String[] newWords = new String[arrList.size()];
        for(int f = 0; f < arrList.size(); f++) {
            newWords[f] = arrList.get(f);
        }
        
        
        return newWords;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        String[][] words = new String[8][];
        
        scan.close();
        
        
        words[0] = s.split("\\s+");
        words[1] = regexx(words[0],"\\,+"); 
        words[2] = regexx(words[1],"\\?+"); 
        words[3] = regexx(words[2],"\\.+");
        words[4] = regexx(words[3],"\\'+");
        words[5] = regexx(words[4],"\\_+");
        words[6] = regexx(words[5],"\\!+");
        words[7] = regexx(words[6],"\\@+");
        
        for (String c : words[7]) {
        if (!((c.compareTo("a") >= 0 && c.compareTo("z") <= 0 || c.compareTo("A") >= 0 && c.compareTo("Z") <= 0 ))) {
            System.out.println(0);
            return; 
        }
    }
        
        System.out.println(words[7].length);
        
        for(int i = 0; i < words[7].length;i++) {
            System.out.println(words[7][i]);
        }
        
        
    }
}

