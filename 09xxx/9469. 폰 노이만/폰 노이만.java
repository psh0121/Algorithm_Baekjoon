import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int cnt = sc.nextInt();
    	
    	for(int i = 0; i < cnt; i++) {
    		int n = sc.nextInt();
    		
    		double d = sc.nextDouble();	// 철로 길이
    		double a = sc.nextDouble();	// 기차 a의 속도
    		double b = sc.nextDouble();	// 기차 b의 속도 
    		double f = sc.nextDouble();	// 파리의 속도 
    		
    		double aSumB = a + b;
    		double fTime = d / aSumB;
    		double fDistance = f * fTime;
    		
    		System.out.println(n + " " + fDistance);
    	}
    	
    	sc.close();
    }
}