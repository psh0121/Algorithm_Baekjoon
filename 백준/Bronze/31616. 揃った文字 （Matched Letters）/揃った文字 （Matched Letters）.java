import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        for(int i = 0; i < n; i++) {
        	if(str.charAt(0) != str.charAt(i)) {
        		System.out.println("No");
        		return;
        	}
        }
        
        System.out.println("Yes");
    }
}