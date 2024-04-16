import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int result = sc.nextInt();
    	
    	for(int i = 0; i < 9; i++) result -= sc.nextInt();
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}