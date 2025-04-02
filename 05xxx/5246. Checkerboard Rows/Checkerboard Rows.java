import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int pieces = sc.nextInt();
    		int[] arr = new int[9];
    		
    		for(int j = 0; j < pieces; j++) {
    			sc.nextInt();
    			arr[sc.nextInt()]++;
    		}
    		
    		int res = 0;
    		
    		for(int j = 0; j < arr.length; j++) {
    			res = Math.max(res, arr[j]);
    		}
    		System.out.println(res);
    	}
    	sc.close();
    }
}