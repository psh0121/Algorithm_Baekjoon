import java.util.Scanner;

public class Main {
	
	// 초를 사용해 현재시간 보여주기 
	public static String showCurTime (long totalTime) {
		while(totalTime >= 24 * 3600) totalTime -= 24 * 3600;
		
		long h = totalTime / 3600;
		totalTime %= 3600;
		
		long m = totalTime / 60;
		totalTime %= 60;
		
		long s = totalTime;
		
		return h + " " + m + " " + s;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	// 총시간의 초 => 시간 + 분 + 초;
    	long totalTime = sc.nextInt() * 3600L + sc.nextInt() * 60L + sc.nextInt();
    	int q = sc.nextInt();
    	
    	for(int i = 0; i < q; i++) {
    		int t = sc.nextInt();
    		long c = 0;
    		
    		if(t == 1) {
    			c = sc.nextInt();
    			totalTime += c;
    		}
    		else if(t == 2) {
    			c = sc.nextInt();
    			totalTime -= c;
    			while(totalTime < 0) totalTime += 24 * 3600L;
    		}
    		else {
    			System.out.println(showCurTime(totalTime));
    		}
    	}
    	
    	sc.close();
    }
}
