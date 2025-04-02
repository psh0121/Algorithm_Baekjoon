import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();	// 참가자의 수 
    	int num = 0;	// 참가자 번호 
    	int grade = 0;	// 참가자 점수 
    	int cnt = 0;	// 참가자 제출횟수 
    	int time = 0;	// 참가자 업로드 시간 
    	
    	for(int i = 1; i <= n; i++) {
    		if(i == 1) {
    			num = i;
    			grade = sc.nextInt();
    			cnt = sc.nextInt();
    			time = sc.nextInt();
    			continue;
    		}
    		
    		int curGrade = sc.nextInt();
    		int curCnt = sc.nextInt();
    		int curTime = sc.nextInt();
    		
    		// grade
    		if(curGrade > grade) {
    			num = i;
    			grade = curGrade;
    			cnt = curCnt;
    			time = curTime;
    		}
    		else if(curGrade == grade) {
    			// cnt
    			if(curCnt < cnt) {
    				num = i;
        			grade = curGrade;
        			cnt = curCnt;
        			time = curTime;
    			}
    			else if(curCnt == cnt) {
    				// time
    				if(curTime < time) {
    					num = i;
            			grade = curGrade;
            			cnt = curCnt;
            			time = curTime;
    				}
    			}
    		}
    	}
    	
    	System.out.println(num);
    	
    	sc.close();
    }
}