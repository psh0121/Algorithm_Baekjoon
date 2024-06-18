import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String password = sc.next();

		String result = "";

		for(int i = 0; i < password.length(); i+= k) {
			result += password.charAt(i);
		}

		System.out.println(result);
		sc.close();
    }
}