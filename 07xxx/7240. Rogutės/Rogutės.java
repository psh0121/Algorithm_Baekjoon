import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	 // 트랙수 
    	int s = sc.nextInt();	// 속도 
    	
    	int finalS = 0;		// 마지막구간 속
    	
    	for(int i = 1; i <= n; i++) {
    		finalS += sc.nextInt();
    		
    		if(i == n) continue;
    		
    		if(finalS > s) finalS--;
    	}
    	
    	System.out.println(finalS);
    	sc.close();
    }
}