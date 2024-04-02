import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int num = 1;
    	
    	while(true) {
    		int n = sc.nextInt();
    		if(n == 0) break;
    		
    		int n1 = n * 3;
    		System.out.print(num + ". ");
    		if(n1 % 2 == 0) System.out.print("even ");
    		else System.out.print("odd ");
    		
    		int n2 = (n1 % 2 == 0) ? n1 / 2 : (n1 + 1) / 2;
    		int n3 = n2 * 3;
    		int n4 = n3 / 9;
    		
    		System.out.println(n4);
    		num++;
    	}
    	sc.close();
    }
}