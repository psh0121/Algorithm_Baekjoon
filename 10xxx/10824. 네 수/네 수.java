import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	long num1 = Long.valueOf(sc.next() + sc.next());
    	long num2 = Long.valueOf(sc.next() + sc.next());
    	
    	System.out.println(num1 + num2);
    	
    	sc.close();
    }
}