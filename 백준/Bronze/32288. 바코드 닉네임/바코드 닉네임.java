import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String result = "";

		for(int i = 0; i < n; i++) {
			char letter = str.charAt(i);

			if(letter == 'l') {
				result += "L";
			}
			else {
				result += "i";
			}
		}

		System.out.println(result);
		sc.close();
    }
}
