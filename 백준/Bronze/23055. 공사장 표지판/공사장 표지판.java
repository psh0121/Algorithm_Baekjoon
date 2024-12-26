import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String star = "";

    if(n <= 4) {
      star = "*".repeat(n);

      for(int i = 0; i < n; i++) System.out.println(star);
      return;
    }

    StringBuilder front = new StringBuilder();
    StringBuilder tail = new StringBuilder();

    int midSpace = n-4;
    int space = 0;

    for(int i = 0; i < n / 2; i++) {
      if(i == 0) {
        star = "*".repeat(n);

        front.append(star).append("\n");
        tail.insert(0, star);

        continue;
      }

      star = "*" + " ".repeat(space) + "*" + " ".repeat(midSpace) + "*" + " ".repeat(space) + "*" + "\n";
      front.append(star);
      tail.insert(0, star);

      midSpace -= 2;
      space++;
    }

    if(n % 2 != 0) {
      star = "*" + " ".repeat(space) + "*" + " ".repeat(space) + "*" + "\n";

      front.append(star);
    }
    

    System.out.println(front.toString().trim() +"\n"+ tail.toString().trim());
		sc.close();
    }
}
