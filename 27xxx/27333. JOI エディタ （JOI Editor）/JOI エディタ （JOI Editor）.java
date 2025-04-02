import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		String result = "";

		for(int i = 0; i < n; i++) {
			if(i == n-1) {
				result += str.charAt(i);
				continue;
			}
			
			if(str.charAt(i) == str.charAt(i+1)) {
				result += Character.toString(str.charAt(i)).repeat(2).toUpperCase();

				i++;
			}
			else {
				result += str.charAt(i);
			}
		}

		System.out.println(result);
		sc.close(); 
    }
}
