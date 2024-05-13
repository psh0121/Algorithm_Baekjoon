import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 업무 개수 
    	int t = sc.nextInt();	// 최대 서버 할당시간
    	
    	int curT = t; 	// 남은 서버 할당시간 
    	int day = 0;	// 소요일 
    	
    	for(int i = 0; i < n; i++) {
    		int value = sc.nextInt();	// 사용 시간 
    		if(curT - value > 0) {
    			curT -= value;
    			day++;
    		}
    		else if(curT - value == 0) {
    			curT -= value;
    			day++;
    			break;
    		}
    		else {
    			break;
    		}
    	}
    	
    	System.out.println(day);
    	
    	sc.close();
    }
}