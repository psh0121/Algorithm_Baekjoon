import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int result = 0;

		for(int i = 0; i <= str.length() - 4; i++) {
			if(str.substring(i, i+4).equals("kick")) result++;
		}

		System.out.println(result);
		sc.close(); 
    }
}
