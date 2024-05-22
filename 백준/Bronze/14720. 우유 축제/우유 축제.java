import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int drinkCnt = 0;	// 최대마실수있는 우유 개수
    	int beforeMilk = -1;	// 이전에 마신 우유 
    	
    	for(int i = 0; i < n; i++) {
    		int milk = sc.nextInt();
    		
    		// 첫시작 
    		if(beforeMilk == -1 && milk == 0) {
    			beforeMilk = milk;
    			drinkCnt++;
    			continue;
    		}
    		
    		if(beforeMilk == 0 && milk == 1) {
    			beforeMilk = milk;
    			drinkCnt++;
    		}
    		else if(beforeMilk == 1 && milk == 2) {
    			beforeMilk = milk;
    			drinkCnt++;
    		}
    		else if(beforeMilk == 2 && milk == 0) {
    			beforeMilk = milk;
    			drinkCnt++;
    		}
    	}
    	
    	System.out.println(drinkCnt);
    	sc.close();
    }
}