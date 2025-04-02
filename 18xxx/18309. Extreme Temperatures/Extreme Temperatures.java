import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (sc.hasNext()) {
			String[] arr = sc.nextLine().split(" ");
			int[] temp = new int[arr.length - 1];

			for(int i = 0; i < temp.length; i++) {
				temp[i] = Integer.parseInt(arr[i+1]);
			}

			for(int i = 0; i < temp.length; i++) {
				min = Math.min(min, temp[i]);
				max = Math.max(max, temp[i]);
			}
		}

		System.out.println(min + " " + max);
		sc.close();
    }
}
