import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int n = sc.nextInt();	// 사탕종류 
    		int k = sc.nextInt();	// 최소한 먹어야하는 사탕 수 
    		int cnt = 0;	// 초대 가능한 아이들의 수 
    		
    		for(int j = 0; j < n; j++) {
    			cnt += sc.nextInt() / k;
    		}
    		
    		System.out.println(cnt);
    	}
    	
    	sc.close();
    }
}