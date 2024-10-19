import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		// 피타고라스
		double diagonal = Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2));

		double len = d / diagonal;
		int height = (int) Math.floor(h * len);
		int width = (int) Math.floor(w * len);

		System.out.println(height + " " + width);
		sc.close();
    }
}
