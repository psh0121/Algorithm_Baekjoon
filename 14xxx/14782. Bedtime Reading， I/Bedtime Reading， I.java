import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int i = sc.nextInt();
    	int sum = 0;
    	
    	for(int n = 1; n <= i; n++) {
    		if(i % n == 0) sum += n;
    	}
    	
    	System.out.println(sum);
    	
    	sc.close();
    }
}