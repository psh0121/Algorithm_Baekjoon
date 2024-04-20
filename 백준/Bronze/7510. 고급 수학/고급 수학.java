import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        	
        	Arrays.sort(arr);
        	
    		int a = arr[0];
    		int b = arr[1];
    		int c = arr[2];
    		
    		System.out.println("Scenario #" + i + ":");
    		
    		if(a*a+b*b == c*c) System.out.println("yes");
    		else System.out.println("no");
    		
    		System.out.println();
    	}
    	
    	sc.close();
    }
}