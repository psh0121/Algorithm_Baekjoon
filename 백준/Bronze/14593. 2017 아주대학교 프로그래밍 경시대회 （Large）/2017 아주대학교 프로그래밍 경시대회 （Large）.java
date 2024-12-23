import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
  int s;  // 점수
  int c;  // 횟수
  int l;  // 업로드 시간
  int num;

  public Person(int s, int c, int l, int num) {
    this.s = s;
    this.c = c;
    this.l = l;
    this.num = num;
  }

  public int getS() {
    return s;
  }

  public int getC() {
    return c;
  }

  public int getL() {
    return l;
  }

  public int getNum() {
    return num;
  }
}

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    List<Person> people = new ArrayList<>();
    for(int i = 1; i <= n; i++) {
      people.add(new Person(sc.nextInt(), sc.nextInt(), sc.nextInt(), i));
    }

    people.sort((p1, p2) -> {
      if(p1.getS() != p2.getS()) {
        return p2.getS() - p1.getS();
      }
      
      if(p1.getC() != p2.getC()) {
        return p1.getC() - p2.getC();
      }

      return p1.getL() - p2.getL();
    });

    System.out.println(people.get(0).getNum());
		sc.close();
    }
}
