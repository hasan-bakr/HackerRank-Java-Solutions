import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
	    Scanner scanner  = new Scanner(System.in);
	    String loopsTime = scanner.nextLine();
	    int loopsTimes = Integer.parseInt(loopsTime);
	    String lines;
	    int[][] arr = new int[loopsTimes][3];
	    String[][] piece = new String[loopsTimes][3];
	    
	    for(int i = 0; i < loopsTimes; i++)
	   	{
	   		lines = scanner.nextLine();
	   		piece[i] = lines.split(" ");
	   		
	   		for(int p = 0; p < 3; p++)
	   		{
	   			arr[i][p] = Integer.parseInt(piece[i][p]);
	            
	   		}
	            
	   	}
	    
	    scanner.close();
	    
	    double power;
	    
	    double result;
	    
	    for(int i = 0; i < arr.length; i++)
	    {
	        result = arr[i][0];
	        for(int p = 0; p < arr[i][2]; p++)
	        {
	        power = Math.pow(2, p);
	        result += power * arr[i][1];
	        if(p != arr[i][2] - 1)
	        {
	            System.out.print((int)result + " ");    
	        }
	        else
	        {
	            System.out.print((int)result);
	        }
	        }
	        if(i != arr.length - 1)
	        {
	        System.out.println();
	        }
	    }
   
}
}