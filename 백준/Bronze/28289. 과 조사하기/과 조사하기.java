import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int sw = 0;
		int imsw = 0;
		int aisw = 0;
		int no = 0;

		for(int i = 0; i < p; i++) {
			int g = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();

			if(g == 1) {
				no++;
				continue;
			}

			switch (c) {
				case 1:
					sw++;
					break;
				case 2:
					sw++;
					break;
				case 3:
					imsw++;
					break;
				default:
					aisw++;
					break;
			}

		}

		System.out.println(sw);
		System.out.println(imsw);
		System.out.println(aisw);
		System.out.println(no);
		sc.close();
    }
}