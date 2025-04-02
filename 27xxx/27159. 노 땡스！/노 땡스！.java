import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		// 3~35 카드
		// 오름차순정렬후 이웃한 수끼리 차가 1인 구간들로 그룹 나눠
		// 그룹별 가장 작은 수를 합한 값 점수

		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n];
		String[] strArr = sc.nextLine().split(" ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(strArr[i]);

		Arrays.sort(arr);

		int sumGrade = arr[0];
		int beforeNum = arr[0];

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - beforeNum == 1) {
				beforeNum = arr[i];
				continue;
			}

			sumGrade += arr[i];
			beforeNum = arr[i];
		}

		System.out.println(sumGrade);
		sc.close();
    }
}