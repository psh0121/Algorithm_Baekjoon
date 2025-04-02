import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int val1 = (int)(-a + Math.sqrt(a * a - b));
		int val2 = (int)(-a - Math.sqrt(a * a - b));

		if(val1 == val2) System.out.println(val1);
		else if(val1 < val2) System.out.println(val1 + " " + val2);
		else System.out.println(val2 + " " + val1);

		sc.close();
    }
}