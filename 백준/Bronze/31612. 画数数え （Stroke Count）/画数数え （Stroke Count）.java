import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int result = 0;
        
        for(int i = 0; i < n; i++) {
        	if(str.charAt(i) == 'j') result += 2;
        	else if(str.charAt(i) == 'o') result += 1;
        	else result += 2;
        }
        
        System.out.println(result);
    }
}