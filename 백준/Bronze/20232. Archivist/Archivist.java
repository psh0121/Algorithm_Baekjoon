import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		String[] winner = new String[]{"ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO",
                "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
                "ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO"};
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		System.out.println(winner[year - 1995]);
	}
}         