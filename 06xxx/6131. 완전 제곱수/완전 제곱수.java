import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cnt = 0;
    	
    	for(int b = 1; b <= 500; b++) {
    		for(int a = b; a <= 500; a++) {
    			if(Math.pow(a, 2) - Math.pow(b, 2) == n) cnt++;
    		}
    	}
    	
    	System.out.println(cnt);
    	
    	sc.close();
    }
}