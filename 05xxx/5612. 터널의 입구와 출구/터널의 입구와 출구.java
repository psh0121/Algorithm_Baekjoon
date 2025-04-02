import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int maxCar = sc.nextInt();	// 자동차 최대값 
    	int curCnt = maxCar;	// 현재 자동차 수 
    	
    	for(int i = 0; i < n; i++) {
    		int in = sc.nextInt();
    		int out = sc.nextInt();
    		
    		if(curCnt + in - out < 0) {
    			maxCar = 0;
    			break;
    		}
    		
    		curCnt = curCnt + in - out;
    		maxCar = Math.max(maxCar, curCnt);
    	}
    	
    	System.out.println(maxCar);
    	sc.close();
    }
}