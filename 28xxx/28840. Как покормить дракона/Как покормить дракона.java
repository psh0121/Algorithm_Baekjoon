import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] today = sc.next().split(":");
		String[] tommorrow = sc.next().split(":");

		int todayMin = Integer.parseInt(today[0]) * 60 + 
					Integer.parseInt(today[1]);

		int tommorrowMin = Integer.parseInt(tommorrow[0]) * 60 + 
					Integer.parseInt(tommorrow[1]);

		int totalMin = (24*60 - todayMin) + tommorrowMin;

		int hh = totalMin / 60;
		int mm = totalMin % 60;

		System.out.printf("%02d:%02d", hh, mm);
		sc.close();
    }
}
