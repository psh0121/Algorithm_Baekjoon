import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] semina = {"Algorithm", "DataAnalysis", "ArtificialIntelligence",
							"CyberSecurity", "Network", "Startup", "TestStrategy"};
		String[] room = {"204", "207", "302", "B101", "303", "501", "105"};

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(room[Arrays.asList(semina).indexOf(sc.next())]);
		}
	}
}         
