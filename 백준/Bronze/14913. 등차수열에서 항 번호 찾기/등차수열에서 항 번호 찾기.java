import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int d = sc.nextInt();
    	int k = sc.nextInt();
    	
    	// 반례 
    	if(d > 0 && k < a) {
    		System.out.println("X");
    		return;
    	}
    	else if(d < 0 && k > a) {
    		System.out.println("X");
    		return;
    	}
    	
    	// 공차수열 : a + (n-1)d
    	double n = (double)(k - a + d) / d;
    	
    	System.out.println(n != (int)n ? "X" : (int)n);
    	
    	sc.close();
    }
}