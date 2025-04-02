import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char start = str.charAt(0);
        char end = str.charAt(str.length() - 1);
        
        if(start == '"' && end == '"') {
        	if(str.length() <= 2) System.out.println("CE");
        	else System.out.println(str.substring(1,  str.length() - 1));
        }
        else System.out.println("CE");
    }
}