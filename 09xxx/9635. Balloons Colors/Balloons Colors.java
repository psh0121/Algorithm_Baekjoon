import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	for(int i = 0; i < t; i++) {
    		int cnt = sc.nextInt();
    		int easy = sc.nextInt();
    		int hard = sc.nextInt();
    		
    		boolean easyFlag = false;
    		boolean hardFlag = false;
    		
    		for(int j = 0; j < cnt; j++) {
    			int num = sc.nextInt();
    			
    			if(j == 0 && num == easy) easyFlag = true;
    			else if(j == cnt-1 && num == hard) hardFlag = true;
    		}
    		
    		if(easyFlag == true && hardFlag == true) System.out.println("BOTH");
    		else if(easyFlag == true && hardFlag == false) System.out.println("EASY");
    		else if(easyFlag == false && hardFlag == true) System.out.println("HARD");
    		else System.out.println("OKAY");
    	}
    	
    	sc.close();
    }
}