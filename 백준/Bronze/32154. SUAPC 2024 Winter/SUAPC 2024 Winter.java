import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] rank = {0, 11, 9, 9, 9, 8, 8, 8, 8, 8, 8};
		String[] problem = {"", "A B C D E F G H J L M",
							"A C E F G H I L M", "A C E F G H I L M",
							"A B C E F G H L M", "A C E F G H L M",
							"A C E F G H L M", "A C E F G H L M",
							"A C E F G H L M", "A C E F G H L M",
							"A B C F G H L M"
						};
		
		int num = sc.nextInt();
		
		System.out.println(rank[num]);
		System.out.println(problem[num]);
        sc.close();
    }
}
