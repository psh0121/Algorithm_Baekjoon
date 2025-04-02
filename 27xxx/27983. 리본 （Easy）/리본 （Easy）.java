import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] xArr = new int[n];
		int[] lArr = new int[n];
		String[] colorArr = new String[n];

		for(int i = 0; i < n; i++) {
			xArr[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			lArr[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			colorArr[i] = sc.next();
		}

		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(!colorArr[i].equals(colorArr[j])) {
					if(Math.abs(xArr[i] - xArr[j]) <= lArr[i] + lArr[j]) {
						System.out.println("YES");
						System.out.println((i+1) + " " + (j+1));
						return;
					}
				}
			}
		}

		System.out.println("NO");

		sc.close(); 
    }
}
