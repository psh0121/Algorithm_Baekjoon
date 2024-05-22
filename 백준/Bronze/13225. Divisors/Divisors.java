import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int c = sc.nextInt();
    	
    	for(int i = 0; i < c; i++) {
    		int n = sc.nextInt();
    		int cnt = 0;
    		
    		for(int j = 1; j <= n; j++) {
    			if(n % j == 0) cnt++;
    		}
    		
    		System.out.printf("%d %d\n", n, cnt);
    	}
    	
    	sc.close();
    }
}