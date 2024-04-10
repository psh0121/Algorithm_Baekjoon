import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int cnt = 1;
    	
    	while(true) {
    		int n = sc.nextInt();
    		if(n == 0) break;
    		
    		if(n % 2 == 0) n = n / 2;
    		else n = n / 2 + 1;
    		
    		n += n / 2;
    		
    		System.out.println("File #" + cnt++);
    		System.out.println("John needs " + (n + 1860000 - 1)/1860000 + " floppies.");
    		System.out.println();
    	}
    	
    	
    	sc.close();
    }
}