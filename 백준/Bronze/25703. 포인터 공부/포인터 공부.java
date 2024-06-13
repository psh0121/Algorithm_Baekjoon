import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("int a;");
		System.out.println("int *ptr = &a;");

		for(int i = 2; i <= n; i++) {
			if(i == 2) System.out.printf("int %sptr%d = &ptr;\n", "*".repeat(i), i);
			else System.out.printf("int %sptr%d = &ptr%d;\n", "*".repeat(i), i, i - 1);
		}

		sc.close();
    }
}