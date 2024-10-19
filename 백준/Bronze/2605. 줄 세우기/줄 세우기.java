import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] turns = new int[n];

		// 학생들이 뽑은 번호를 입력받음
		for(int i = 0; i < n; i++) {
			turns[i] = sc.nextInt();
		}

		// 최종 줄을 저장할 리스트
		ArrayList<Integer> line = new ArrayList<>();

		// 처리
		for(int i = 0; i < n; i++) {
			int num = i + 1;
			int position = i - turns[i];

			line.add(position, num);
		}

		for(int student : line) {
			System.out.print(student + " ");
		}
		sc.close();
    }
}
