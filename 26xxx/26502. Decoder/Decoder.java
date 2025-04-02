import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String result = "";
			for(int j = 0; j < str.length(); j++) {
				char val = str.charAt(j);

				if(val == 'y') result += 'a';
				else if(val == 'a') result += 'e';
				else if(val == 'e') result += 'i';
				else if(val == 'i') result += 'o';
				else if(val == 'o') result += 'u';
				else if(val == 'u') result += 'y';
				else if(val == 'Y') result += 'A';
				else if(val == 'A') result += 'E';
				else if(val == 'E') result += 'I';
				else if(val == 'I') result += 'O';
				else if(val == 'O') result += 'U';
				else if(val == 'U') result += 'Y';
				else result += val;
			}

			System.out.println(result);
		}
        sc.close();
    }
}
