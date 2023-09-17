import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    private static String validator(String userName) {
        
        Pattern model = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");
        Matcher match = model.matcher(userName);
        boolean matchFound = match.matches();
        
        if(matchFound) {
            return "Valid";
        }
        else {
            return "Invalid";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < times; i++) {
    
            String userName = sc.nextLine();    
            System.out.println(validator(userName));
        }
        sc.close();
    }
}
