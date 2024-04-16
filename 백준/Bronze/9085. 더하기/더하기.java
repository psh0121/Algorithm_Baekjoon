import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int m = sc.nextInt();
    		int result = 0;
    		
    		for(int j = 0; j < m; j++) {
    			result += sc.nextInt();
    		}
    		
    		System.out.println(result);
    	}
    	
    	sc.close();
    }
}