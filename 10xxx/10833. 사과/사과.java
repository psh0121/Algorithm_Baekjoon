import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cnt = 0;
    	
    	for(int i = 0; i < n; i++) {
    		int school = sc.nextInt();
    		int apple = sc.nextInt();
    		cnt += (apple % school);
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}