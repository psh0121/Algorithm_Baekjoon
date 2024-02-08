import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String result = "";
		
		for(int i = 1; i <= 5; i++) {
			if(sc.next().contains("FBI")) result += i + " ";
		}
		
		System.out.println(result.length() == 0 ? "HE GOT AWAY!" : result);
	}
}

