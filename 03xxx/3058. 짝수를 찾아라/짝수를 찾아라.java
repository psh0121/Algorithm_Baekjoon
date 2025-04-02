import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < n; i++) {
        	String[] strArr = sc.nextLine().split(" ");
        	int[] arr = new int[strArr.length];
        	
        	for(int k = 0; k < arr.length; k++) arr[k] = Integer.parseInt(strArr[k]);
        	
        	int sum = 0;
        	int minNum = Integer.MAX_VALUE;
        	
        	for(int j = 0; j < arr.length; j++) {
        		if(arr[j] % 2 == 0) {
        			sum += arr[j];
        			minNum = Math.min(minNum, arr[j]);
        		}
        	}
        	
        	System.out.println(sum + " " + minNum);
        }
    }
}