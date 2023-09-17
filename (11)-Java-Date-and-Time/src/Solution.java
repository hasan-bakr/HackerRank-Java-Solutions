import java.io.*;
import java.util.*;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar takvim = Calendar.getInstance();
        takvim.set(year,month - 1, day);
        
        
        String gunIsmi = takvim.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
        
        return gunIsmi;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}