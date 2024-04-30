import java.util.Scanner;

public class Main {
	
	public static int getIntCnt(int n, int m) {
		int cnt = 0;
		
		for(int a = 1; a < n; a++) {
			for(int b = a+1; b < n; b++) {
				double value = (Math.pow(a, 2) + Math.pow(b, 2) + m) / (a * b);
				
				if(value % 1 == 0) cnt++;
			}
		}
		return cnt;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		
    		System.out.println(getIntCnt(n,m));
    	}
    	
    	sc.close();
    }
}