import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] arr = sc.nextLine().split(" ");
    	int[] numArr = new int[arr.length];
    	
    	int sum  = 0;
    	
    	for(int i = 0; i < numArr.length; i++) {
    		numArr[i] = Integer.valueOf(arr[i]);
    		sum += numArr[i];
    	}
    	
    	System.out.println(sum);
    	
    	sc.close();
    }
}