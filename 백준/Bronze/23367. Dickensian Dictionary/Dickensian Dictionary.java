import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String left = "qwertasdfgzxcvb";
        String right = "yuiophjklnm";

        String str = sc.next();

        for(int i = 0; i < str.length() - 1; i++) {
            char l = str.charAt(i);
            char r = str.charAt(i+1);

            String lInfo = "";
            String rInfo = "";

            if(left.contains(Character.toString(l))) lInfo = "left";
            else lInfo = "right";

            if(left.contains(Character.toString(r))) rInfo = "left";
            else rInfo = "right";

            if(lInfo.equals(rInfo)) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
        sc.close();
    }
}