import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	int cnt = 0;	// 허용가능 가방 개수 
    	
    	for(int i = 0; i < t; i++) {
    		double h = sc.nextDouble();	// 높이 
    		double w = sc.nextDouble();	// 가로 
    		double l = sc.nextDouble();	// 세로 
    		double kg = sc.nextDouble();	// 가방 무게 
    		
    		// 가방이 각 길이에 준수하고 7키로 안넘는다 
    		// 가방의 세변의 합이 125를 초과하지 않고 7키로 안넘는다
    		if(h <= 56 && w <= 45 && l <= 25 && kg <= 7) {
    			cnt++;
    			System.out.println(1);
    		}
    		else if((h+w+l) <= 125 && kg <= 7) {
    			cnt++;
    			System.out.println(1);
    		}
    		// 그외
    		else {
    			System.out.println(0);
    		}
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}