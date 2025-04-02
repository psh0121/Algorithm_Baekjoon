import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 날의 수 
    	int k = sc.nextInt();	// 개선목표 
    	int result = 0;
    	
    	int before = sc.nextInt();	// 이전 실력 
    	
    	for(int i = 1; i < n; i++) {
    		int cur = sc.nextInt();	// 현재 실력 
    		
    		if(before - cur >= k) result++;
    		
    		before = cur;
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}