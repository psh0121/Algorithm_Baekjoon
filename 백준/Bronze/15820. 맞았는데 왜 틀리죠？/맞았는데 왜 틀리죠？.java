import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();

		boolean acceptedFlag = true;

		for(int i = 0; i < s1; i++) {
			int sample = sc.nextInt();
			int manyoung1 = sc.nextInt();

			if (sample != manyoung1) {
				acceptedFlag = false;
				break;
			}
		}

		if(!acceptedFlag) {
			System.out.println("Wrong Answer");
			return;
		}

		for(int i = 0; i < s2; i++) {
			int system = sc.nextInt();
			int manyoung2 = sc.nextInt();

			if(system != manyoung2) {
				acceptedFlag = false;
				break;
			}
		}


		if(!acceptedFlag) {
			System.out.println("Why Wrong!!!");
		}
		else {
			System.out.println("Accepted");
		}
    	sc.close();
    }
}