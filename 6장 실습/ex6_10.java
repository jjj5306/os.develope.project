import java.util.Scanner;
class P {
    private int n1, n2, n3;
    public String name;
    public P(String name) {
        this.name = name;
    }
    public boolean game() {
        n1 = (int)((Math.random() * 3) + 1);
        n2 = (int)((Math.random() * 3) + 1);
        n3 = (int)((Math.random() * 3) + 1);
        System.out.print("\t" + n1 + " " + n2 + " " + n3+" ");
        if(n1 == n2 && n2 == n3)
            return true;
        else
            return false;
    }
}
public class ex6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        String name = sc.next();
        P p1 = new P(name);

        System.out.print("2번째 선수 이름>>");
        name =sc.next();
        P p2 = new P(name);

        String temp = sc.nextLine();
        while(true) {
            System.out.print("["+p1.name+"]:<Enter>");
            temp = sc.nextLine();
            if(p1.game()) {
                System.out.println(p1.name + "님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");
            System.out.print("[" + p2.name + "]:<Enter>");

            temp = sc.nextLine();
            if(p2.game()) {
                System.out.println(p2.name + "님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");
        }
        sc.close();
    }
}
