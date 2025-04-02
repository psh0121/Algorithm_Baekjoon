import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			
			int usaCnt = 0;
			int russiaCnt = 0;

			for(int j = 0; j < 3; j++) {
				usaCnt += Integer.parseInt(arr[j]);
				russiaCnt += Integer.parseInt(arr[j+3]);
			}

			int usaG = Integer.parseInt(arr[0]);
			int usaS = Integer.parseInt(arr[1]);
			int usaB = Integer.parseInt(arr[2]);

			int russiaG = Integer.parseInt(arr[3]);
			int russiaS = Integer.parseInt(arr[4]);
			int russiaB = Integer.parseInt(arr[5]);

			boolean usaWin = true;

			if(usaG > russiaG|| 
			(usaG == russiaG && usaS > russiaS) || 
			(usaG == russiaG && usaS == russiaS && usaB > russiaB)) {
				usaWin = true;
			}
			else usaWin = false;

			System.out.println(str);

			if(usaCnt > russiaCnt && usaWin) System.out.println("both");
			else if(usaWin) System.out.println("color");
			else if(usaCnt > russiaCnt) System.out.println("count");
			else System.out.println("none");

			System.out.println();
		}

        sc.close();
    }
}
