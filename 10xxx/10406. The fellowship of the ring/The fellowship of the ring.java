import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int waist = sc.nextInt();
    	int neck = sc.nextInt();
    	int cnt = sc.nextInt();
    	int result = 0;
    	
    	for(int i = 0; i < cnt; i++) {
    		int punch = sc.nextInt();
    		
    		if(punch >= waist && punch <= neck) result++;
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}