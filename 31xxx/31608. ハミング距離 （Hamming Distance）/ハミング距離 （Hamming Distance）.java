import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        int result = 0;
        
        for(int i = 0; i < n; i++) {
        	if(str1.charAt(i) != str2.charAt(i)) result++;
        }
        
        System.out.println(result);
    }
}