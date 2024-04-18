import java.util.Scanner;

public class Main {
	
	public static int getA(int a) {
		int result = 0;
		
		if(a == 0) result = 0;
		else if(a == 1) result = 5000000;
		else if(a <= 3) result = 3000000;
		else if(a <= 6) result = 2000000;
		else if(a <= 10) result = 500000;
		else if(a <= 15) result = 300000;
		else if(a <= 21) result = 100000;
		
		return result;
	}
	
	public static int getB(int b) {
		int result = 0;
		
		if(b == 0) result = 0;
		else if(b == 1) result = 5120000;
		else if(b <= 3) result = 2560000;
		else if(b <= 7) result = 1280000;
		else if(b <= 15) result = 640000;
		else if(b <= 31) result = 320000;
		
		return result;
	}
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		
    		System.out.println(getA(a) + getB(b));
    	}
    	
    	sc.close();
    }
}