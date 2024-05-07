import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] arr = {sc.next(), sc.next(), sc.next()};
    	
    	Arrays.sort(arr);
    	
    	char k = arr[0].charAt(0);
    	char l = arr[1].charAt(0);
    	char p = arr[2].charAt(0);
    	
    	if(k == 'k' && l == 'l' && p == 'p') System.out.println("GLOBAL");
    	else System.out.println("PONIX");
    	
    	sc.close();
    }
}