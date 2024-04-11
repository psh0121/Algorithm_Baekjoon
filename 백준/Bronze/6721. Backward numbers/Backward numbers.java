import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int n1 = Integer.parseInt(new StringBuffer(sc.next()).reverse().toString());
    		int n2 = Integer.parseInt(new StringBuffer(sc.next()).reverse().toString());
    		
    		String sum = Integer.toString(n1+n2);
    		
    		System.out.println(Integer.parseInt(new StringBuffer(sum).reverse().toString()));
    	}
    }
}