import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 1; i <= t; i++) {
    		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};		// 세변 
    		Arrays.sort(arr);	// 정렬 
    		
    		int a = arr[0];
    		int b = arr[1];
    		int c = arr[2];
    		
    		if(a*a + b*b == c*c) {
    			System.out.println("Case #" + i + ": YES");
    		}
    		else {
    			System.out.println("Case #" + i + ": NO");
    		}
    	}
    	
    	sc.close();
    }
}