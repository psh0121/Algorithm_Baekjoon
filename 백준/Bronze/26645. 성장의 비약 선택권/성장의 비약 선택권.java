import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n >= 200 && n <= 205) System.out.println(1);
		else if(n >= 206 && n <= 217) System.out.println(2);
		else if(n >= 218 && n <= 228) System.out.println(3);
		else System.out.println(4);
		sc.close();
    }
}