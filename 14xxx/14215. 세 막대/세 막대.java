import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] abc = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
    	Arrays.sort(abc);
    	
    	int a = abc[0];
    	int b = abc[1];
    	int c = abc[2];
    	
    	if(a + b > c) System.out.println(a + b + c);
    	else System.out.println(a + b + (a + b - 1));
    	
    	sc.close();
    }
}