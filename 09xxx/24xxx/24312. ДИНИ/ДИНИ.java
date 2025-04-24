import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] wm = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(wm);

		int wm22 = Math.abs((wm[0] + wm[3]) - (wm[1] + wm[2]));
		int wm31 = Math.abs((wm[0] + wm[1] + wm[2]) - wm[3]);

		System.out.println(wm22 < wm31 ? wm22 : wm31);
		sc.close();
    }
}
