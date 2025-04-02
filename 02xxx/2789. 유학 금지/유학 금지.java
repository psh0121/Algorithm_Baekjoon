import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String cambridge = "CAMBRIDGE";
		String str = sc.next();

		String result = "";

		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);

			if(cambridge.contains(Character.toString(letter))) continue;

			result += letter;
		}

		System.out.println(result);
		sc.close();
    }
}
