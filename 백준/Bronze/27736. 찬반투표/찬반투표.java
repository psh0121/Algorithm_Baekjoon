import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		// 찬성1, 반대-1, 기권0
		int n = sc.nextInt();
		int yes = 0;
		int no = 0;
		int inval = 0;

		for(int i = 0; i < n; i++) {
			int vote = sc.nextInt();

			switch (vote) {
				case 1:
					yes++;	
					break;
				case -1:
					no++;
					break;
				default:
					inval++;
					break;
			}

			if(inval >= Math.ceil((double)n / 2)) {
				System.out.println("INVALID");
				return;
			}
		}

		System.out.println(yes > no ? "APPROVED" : "REJECTED");
		sc.close();
    }
}