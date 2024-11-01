import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		int n = sc.nextInt();
		String strA = sc.next();
		String strB = sc.next();

		for(int i = 0; i < n; i++) {
			char letterA = strA.charAt(i);
			char letterB = strB.charAt(i);

			if(letterA != letterB) {
				if(letterA == 'R' && letterB == 'S') a++;
				else if(letterA == 'P' && letterB == 'R') a++;
				else if(letterA == 'S' && letterB == 'P') a++;
				else b++;
			}
		}

		System.out.println(a > b ? "victory" : "defeat");
        sc.close();
    }
}
