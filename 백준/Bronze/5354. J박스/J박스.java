import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int m = sc.nextInt();
    		for(int j = 0; j < m; j++) {
    			if(j == 0 || j == (m-1)) {
    				System.out.println("#".repeat(m));
    				continue;
    			}
    			
    			System.out.println("#" + "J".repeat(m - 2) + "#");
    		}
    		System.out.println();
    	}
    	
    	sc.close();
    }
}