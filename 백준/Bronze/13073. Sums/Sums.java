import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int num = sc.nextInt();
    		
    		int s1 = num * (num + 1) / 2;
    		int s2 = num * num;
    		int s3 = num * (num + 1);
    		
    		System.out.printf("%d %d %d\n", s1, s2, s3);
    	}
    	
    	sc.close();
    }
}