import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[21];
		for(int i = 0; i < 21; i++) arr[i] = i;

		for(int i = 0; i < 10; i++) {
			int[] newArr = new int[21];
			int a = sc.nextInt();
			int b = sc.nextInt();
			int idx = b;

			for(int j = 1; j <= 20; j++) {
				if(j >= a && j <= b) {
					newArr[j] = arr[idx--];
				}
				else newArr[j] = arr[j];
			}

			arr = newArr;
		}

		for(int i = 1; i <= 20; i++) {
			System.out.print(arr[i]);

			if(i != 20) System.out.print(" ");
		}
		sc.close();
    }
}
