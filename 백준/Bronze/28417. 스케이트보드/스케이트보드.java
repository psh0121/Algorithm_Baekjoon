import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// 런2, 트릭5
		// 런 최고점수, 상위2 트릭점수 더한값
		int n = sc.nextInt();

		int maxGrade = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++) {
			Integer[] run = new Integer[2];
			for(int j = 0; j < 2; j++) run[j] = sc.nextInt();

			Integer[] trick = new Integer[5];
			for(int j = 0; j < 5; j++) trick[j] = sc.nextInt();

			Arrays.sort(run, new Comparator<Integer>() {
				@Override
				public int compare(Integer a, Integer b) {
					return b - a;
				}
			});

			Arrays.sort(trick, new Comparator<Integer>() {
				@Override
				public int compare(Integer a, Integer b) {
					return b - a;
				}
			});

			int grade = run[0] + trick[0] + trick[1];

			if(maxGrade < grade) maxGrade = grade;
		}

		System.out.println(maxGrade);
		sc.close();
    }
}