import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int x = sc.nextInt() * 1000;
    	int k = sc.nextInt() * 1000;
    	
    	int ml = 0;
    	
    	// 머리 
    	ml = k + k * 2 + k * 2 * 2;
    	
    	if(ml <= x) {
    		System.out.println(ml);
    		return;
    	}
    	
    	// 몸통 
    	ml = k / 2 + k + k * 2;
    	
    	if(ml <= x) {
    		System.out.println(ml);
    		return;
    	}
    	
    	// 하체 
    	ml = k / 2 / 2 + k / 2 + k;
    	
    	if(ml <= x) {
    		System.out.println(ml);
    	}
    	else System.out.println(0);
    	
    	sc.close();
    }
}