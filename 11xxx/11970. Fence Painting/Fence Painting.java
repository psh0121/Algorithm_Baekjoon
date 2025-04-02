import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	
    	// 겹치는가? 
    	int overlap = Math.min(b, d) - Math.max(a, c);
    	
    	int totalLen = (b-a) + (d-c) - Math.max(overlap, 0);
    	
    	System.out.println(totalLen);
    	sc.close();
    }
}