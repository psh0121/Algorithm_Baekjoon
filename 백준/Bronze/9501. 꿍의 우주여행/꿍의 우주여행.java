import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int tc = sc.nextInt();
    	
    	for(int i = 0; i < tc; i++) {
    		int n = sc.nextInt();	// 우주선 개수 
    		int d = sc.nextInt();	// 목적지 까지의 거리
    		int cnt = 0;	// 목적지까지 도착가능한 우주선개수 
    		
    		for(int j = 0; j < n; j++) {
    			double v = sc.nextDouble();	// 최고속도 
    			double f = sc.nextDouble();	// 연료양
    			double c = sc.nextDouble();	// 연료 소비율 
    			
    			double amountF = d/v * c; //  목적지까지 가는데 필요한 연료양 
    			
    			if(amountF <= f) cnt++;
    		}
    		
    		System.out.println(cnt);
    	}
    	
    	sc.close();
    }
}