import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");

		if(str[str.length - 1].equals("eh?")) {
			System.out.println("Canadian!");
		}
		else System.out.println("Imposter!");
		sc.close(); 
    }
}
