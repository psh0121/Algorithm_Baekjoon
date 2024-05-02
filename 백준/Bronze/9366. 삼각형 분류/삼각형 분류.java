import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int cnt = sc.nextInt();
    	
    	for(int i = 1; i <= cnt; i++) {
    		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
    		Arrays.sort(arr);
    		
    		System.out.print("Case #" + i + ": ");
    		if(arr[0] + arr[1] <= arr[2]) System.out.println("invalid!");
    		else if(arr[0] == arr[2]) System.out.println("equilateral");
    		else if(arr[0] == arr[1] || arr[1] == arr[2]) System.out.println("isosceles");
    		else System.out.println("scalene");
    	}
    	
    	sc.close();
    }
}