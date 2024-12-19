import java.util.Scanner;

public class Main {
  public static int game(String me, String you1, String you2) {
    int win = 0;

    switch (me) {
      case "S":
        if(you1.equals("P")) win++;
        if(you2.equals("P")) win++;
        break;
      case "R":
        if(you1.equals("S")) win++;
        if(you2.equals("S")) win++;
        break;
      default:
        if(you1.equals("R")) win++;
        if(you2.equals("R")) win++;
        break;
    }

    return win;
  }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String ml = sc.next();
    String mr = sc.next();
    String tl = sc.next();
    String tr = sc.next();

    int msLeft = game(ml, tl, tr);
    int msRight = game(mr, tl, tr);
    int tkLeft = game(tl, ml, mr);
    int tkRight = game(tr, ml, mr);

    if(msLeft == 2 || msRight == 2) System.out.println("MS");
    else if(tkLeft == 2 || tkRight == 2) System.out.println("TK");
    else System.out.println("?");
		sc.close();
    }
}
