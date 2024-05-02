import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();	// 번호 
    	int cnt = sc.nextInt();	// 문제개수 
    	
    	int finishTime = 210;	// 제한시간 
    	int curTime = 0;	// 현재경과시간 
    	
    	for(int i = 0; i < cnt; i++) {
    		int time = sc.nextInt();	// 소요시간 
    		String result = sc.next();	// 문제 맞혔는지 파악 
    		
    		curTime += time;
    		
    		if(curTime >= finishTime) break;
    		
    		if(result.equals("T")) num++;
    		
    		if(num == 9) num = 1;
    	}
    	
    	System.out.println(num);
    	
    	sc.close();
    }
}