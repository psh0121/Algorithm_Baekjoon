import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double cho = 0.0;
		double han = 1.5;

		int[] choBoard = new int[6];
		int[] hanBoard = new int[6];
		for(int i = 0; i < 6; i++) choBoard[i] = sc.nextInt();
		for(int i = 0; i < 6; i++) hanBoard[i] = sc.nextInt();

		double[] gradeBoard = {13, 7, 5, 3, 3, 2};

		for(int i = 0; i < 6; i++) {
			cho += (double)choBoard[i] * gradeBoard[i];
			han += (double)hanBoard[i] * gradeBoard[i];
		}

		System.out.println(cho > han ? "cocjr0208" : "ekwoo");

		sc.close();
    }
}
