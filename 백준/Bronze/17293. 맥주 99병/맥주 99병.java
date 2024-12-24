import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = n; i >= 0; i--) {
      if(i == 0) {
        if(n == 1) {
          System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, %d bottle of beer on the wall.\n", n);
        }
        else System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, %d bottles of beer on the wall.\n", n);
      }
      else if(i == 1) {
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println();
      }
      else if(i == 2) {
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\n" + 
                    "Take one down and pass it around, 1 bottle of beer on the wall.");
        System.out.println();
      }
      else {
        System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\nTake one down and pass it around, %d bottles of beer on the wall.\n", i, i, i-1);
        System.out.println();
      }
    }
		sc.close();
    }
}
