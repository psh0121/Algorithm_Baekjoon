import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int[] b = {sc.nextInt(), sc.nextInt()};
		int[] d = {sc.nextInt(), sc.nextInt()};
		int[] j = {sc.nextInt(), sc.nextInt()};

		while(true) {
			if(b[0] == j[0] && b[1] == j[1] && d[0] == j[0] && d[1] == j[1]) {
				System.out.println("tie");
				break;
			}
			else if(b[0] == j[0] && b[1] == j[1]) {
				System.out.println("bessie");
				break;
			}
			else if(d[0] == j[0] && d[1] == j[1]) {
				System.out.println("daisy");
				break;
			}

			// bessie
			int bj0distance = b[0] - j[0];
			int bj1distance = b[1] - j[1];

			if(bj0distance < 0) b[0]++;
			else if(bj0distance > 0) b[0]--;

			if(bj1distance < 0) b[1]++;
			else if(bj1distance > 0) b[1]--;

			// daisy
			double updistance = Math.sqrt((d[0] - 1 - j[0]) * (d[0] - 1 - j[0]) + (d[1] - j[1]) * (d[1] - j[1]));
			double downdistance = Math.sqrt((d[0] + 1 - j[0]) * (d[0] + 1 - j[0]) + (d[1] - j[1]) * (d[1] - j[1]));
			double leftdistance = Math.sqrt((d[0] - j[0]) * (d[0] - j[0]) + (d[1] - 1 - j[1]) * (d[1] - 1 - j[1]));
			double rightdistance = Math.sqrt((d[0] - j[0]) * (d[0] - j[0]) + (d[1] + 1 - j[1]) * (d[1] + 1 - j[1]));

			double dMinDistance = Math.min(updistance, downdistance);
			dMinDistance = Math.min(dMinDistance, leftdistance);
			dMinDistance = Math.min(dMinDistance, rightdistance);

			if(dMinDistance == updistance) d[0]--;
			else if(dMinDistance == downdistance) d[0]++;
			else if(dMinDistance == leftdistance) d[1]--;
			else if(dMinDistance == rightdistance) d[1]++;
		}

    	sc.close();
    }
}