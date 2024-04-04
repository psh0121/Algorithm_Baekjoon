import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		String data = sc.next();
    		String temp;
    		int wrongCnt = 0;
    		
    		while(true) {
    			if(data.length() == 0) break;
    			
    			temp = data.substring(0, 8);
    			if(data.length() == 8) data = "";
    			else data = data.substring(8);
    			
    			// 맨뒤에 있는 숫자 알기 
    			int endNum = Integer.valueOf(temp.substring(temp.length() - 1));
    			
    			// temp 1개수 알기 
    			int oneCnt = 0;
    			for(int j = 0; j < temp.length()-1; j++) {
    				if(temp.charAt(j) == '1') oneCnt++;
    			}
    			
    			// 홀수개 짝수개에 따라서 값 출력 
    			if(endNum != oneCnt % 2) wrongCnt++;
    		}
    		
    		System.out.println(wrongCnt);
    	}
    	
    	sc.close();
    }
}