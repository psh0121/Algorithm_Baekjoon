import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int d = sc.nextInt();	// 병렬 개발시간 
    		int n = sc.nextInt();	// 실행횟수 
    		int s = sc.nextInt();	// 직렬실행시간 
    		int p = sc.nextInt();	// 병렬실행시간 
    		
    		int sValue = s * n;
    		int pValue = d + (p * n);
    		
    		if(sValue < pValue) System.out.println("do not parallelize");
    		else if(sValue == pValue) System.out.println("does not matter");
    		else System.out.println("parallelize");
    	}
    	
    	sc.close();
    }
}