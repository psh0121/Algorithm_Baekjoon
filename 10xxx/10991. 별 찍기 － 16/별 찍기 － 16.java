import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	String space = " ";
    	String star = "* ";
    	
    	for(int i = 1; i <= n; i++) {
    		System.out.println(space.repeat(n - i) + star.repeat(i));
    	}
    	
    	sc.close();
    }
}