import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int s = 0;	// STRAWBERRY
		int b = 0;	// BANNA
		int l = 0;	// LIME
		int p = 0;	// PLUM

		for(int i = 0; i < n; i++) {
			String fruit = sc.next();
			int cnt = sc.nextInt();

			if(fruit.equals("STRAWBERRY")) s += cnt;
			else if(fruit.equals("BANANA")) b += cnt;
			else if(fruit.equals("LIME")) l += cnt;
			else p += cnt;
		}

		if(s == 5 || b == 5 || l == 5 || p == 5) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
    }
}
