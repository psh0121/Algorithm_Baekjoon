import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int n = sc.nextInt();
    		if(n == 0) break;
    		
    		System.out.print(n + " => ");
    		
    		int start = 1;
    		int add = 2;
    		
    		for(int i = 1; i <= n; i++) {
    			if(i == n) System.out.println(start);
    			else {
    				start += add;
    				add += 2;
    			}
    		}
    	}
    	sc.close();
    }
}