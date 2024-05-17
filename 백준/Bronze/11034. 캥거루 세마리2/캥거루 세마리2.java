import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()) {
    		int k1 = sc.nextInt();
    		int k2 = sc.nextInt();
    		int k3 = sc.nextInt();
    		
    		System.out.println(Math.max(k2 - k1 - 1, k3 - k2 - 1));
    	}
    }
}