import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for(int i = str.length() - 1; i >= 0; i--) {
			if("aeiou".contains(Character.toString(str.charAt(i)))){
				System.out.println(str.substring(0, i+1) + "ntry");
				return;
			}
		}
        sc.close();
    }
}
