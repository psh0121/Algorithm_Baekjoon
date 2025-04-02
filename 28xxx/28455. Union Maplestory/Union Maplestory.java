import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] levels = new Integer[n];
    for(int i = 0; i < n; i++) levels[i] = sc.nextInt();

    Arrays.sort(levels, (a, b) -> b - a);

    long totalLevels = 0;
    long totalAbility = 0;

    for(int i = 0; i < (n > 42 ? 42 : n); i++) {
      int level = levels[i];

      totalLevels += level;

      if(level >= 60 && level < 100) totalAbility += 1;
      else if(level >= 100 && level < 140) totalAbility += 2;
      else if(level >= 140 && level < 200) totalAbility += 3;
      else if(level >= 200 && level < 250) totalAbility += 4;
      else if(level >= 250) totalAbility += 5;
    }

    System.out.println(totalLevels + " " + totalAbility);
		sc.close();
    }
}
