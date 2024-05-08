import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int n = sc.nextInt();	// 함선수 
    		double d = sc.nextDouble();	// 거리 
    		
    		int cnt = 0;	// 탐사지까지 도달할 수 있는 함선 수 
    		
    		for(int j = 0; j < n; j++) {
    			double v = sc.nextDouble();	// 속도 
    			double f = sc.nextDouble();	// 연료 
    			double c = sc.nextDouble();	// 연비 
    			
    			// 탐사지까지 필요연료 
    			double needF = d / v * c;
    			
    			if(needF <= f) cnt++;
    		}
    		
    		System.out.println(cnt);
    	}
    	
    	sc.close();
    }
}