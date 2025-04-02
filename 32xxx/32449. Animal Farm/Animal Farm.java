import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] animalName = new String[n];
		int[] animalNum = new int[n];

		int maxPig = 0;

		for(int i = 0; i < n; i++) {
			animalName[i] = sc.next();
			animalNum[i] = sc.nextInt();

			if(animalName[i].equals("pig")) {
				maxPig = Math.max(maxPig, animalNum[i]);
			}
		}

		long result = (long)maxPig;

		for(int i = 0; i < n; i++) {
			if(animalName[i].equals("pig")) continue;

			if(animalNum[i] >= maxPig) continue;
			else result += 1l * animalNum[i];
		}

		System.out.println(result);
		sc.close();
    }
}
