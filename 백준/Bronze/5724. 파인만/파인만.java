import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int n = sc.nextInt();
    		if(n == 0) break;
    		
    		int cnt = 0;
    		
    		for(int i = 1; i <= n; i++) {
    			cnt += Math.pow(i, 2);
    		}
    		
    		System.out.println(cnt);
    	}
    	sc.close();
    }
}