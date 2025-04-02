import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int n = sc.nextInt();	// 소요일수
    		int maxNum = 0;		// A, B, C 중 가장 큰수 (음수면, 0) 
    		int totalGood = 0;	// 최대 이익 
    		
    		for(int j = 0; j < n; j++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			int c = sc.nextInt();
    			
    			maxNum = Math.max(a, b);
    			maxNum = Math.max(maxNum, c);
    			maxNum = Math.max(maxNum, 0);
    			
    			totalGood += maxNum;
    		}
    		
    		System.out.println(totalGood);
    	}
    	sc.close();
    }
}