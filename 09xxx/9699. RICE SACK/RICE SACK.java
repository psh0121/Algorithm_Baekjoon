import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.valueOf(sc.nextLine());
    	
    	for(int i = 1; i <= n; i++) {
    		String[] arr = sc.nextLine().split(" ");
    		int[] numArr = new int[arr.length];
    		for(int j = 0; j < numArr.length; j++) {
    			numArr[j] = Integer.valueOf(arr[j]);
    		}
    		
    		Arrays.sort(numArr);
    		
    		System.out.println("Case #" + i + ": " + numArr[numArr.length-1]);
    	}
    	
    	sc.close();
    }
}