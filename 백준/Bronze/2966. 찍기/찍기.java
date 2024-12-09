import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		String adrianValue = "ABC".repeat(str.length() / 3 + 1);
		String brunoValue = "BABC".repeat(str.length() / 4 + 1);
		String goranValue = "CCAABB".repeat(n);

		int adrian = 0;
		int bruno = 0;
		int goran = 0;

		for(int i = 0; i < n; i++) {
			char problem = str.charAt(i);
			if(problem == adrianValue.charAt(i)) adrian++;
			if(problem == brunoValue.charAt(i)) bruno++;
			if(problem == goranValue.charAt(i)) goran++;
		}

		int maxCorrect = Math.max(adrian, Math.max(bruno, goran));

		System.out.println(maxCorrect);
		if(maxCorrect == adrian) System.out.println("Adrian");
		if(maxCorrect == bruno) System.out.println("Bruno");
		if(maxCorrect == goran) System.out.println("Goran");

		sc.close();
    }
}
