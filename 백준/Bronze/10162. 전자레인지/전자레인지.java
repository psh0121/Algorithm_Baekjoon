import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	if(n % 10 > 0) {
    		System.out.println(-1);
    		return;
    	}
    	
    	int min5 = 0;
    	int min1 = 0;
    	int sec10 = 0;
    	
    	if(n / 300 > 0) {
    		min5 = n / 300;
    		n = n % 300;
    	}
    	
    	if(n / 60 > 0) {
    		min1 = n / 60;
    		n = n % 60;
    	}
    	
    	sec10 = n / 10;
    	
    	System.out.println(min5 + " " + min1 + " " + sec10);
    	
    	sc.close();
    }
}