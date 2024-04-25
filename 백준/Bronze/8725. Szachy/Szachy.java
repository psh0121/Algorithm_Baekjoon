import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[][] arr = new int[n][n];
    	int sum = 0;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			arr[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(int i = 0; i < n; i++) {
    		int maxNum = Integer.MIN_VALUE;
    		
    		for(int j = 0; j < n; j++) {
    			maxNum = Math.max(maxNum, arr[i][j]);
    		}
    		
    		if(maxNum > 0) sum += maxNum;
    	}
    	
    	System.out.println(sum);
    	sc.close();
    }
}