import java.util.Scanner;

class P2 {
    private int n1, n2, n3;
    public String name;

    public P2(String name) {
        this.name = name;
    }

    public boolean game() {
        n1 = (int) ((Math.random() * 3) + 1);
        n2 = (int) ((Math.random() * 3) + 1);
        n3 = (int) ((Math.random() * 3) + 1);
        System.out.print("\t" + n1 + " " + n2 + " " + n3 + " ");
        if(n1 == n2 && n2 == n3)
            return true;
        else
            return false;
    }
}
public class ex6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int n = sc.nextInt();
        P2[] p = new P2[n];

        for(int i = 0; i < n; i++) {
            System.out.print((i+1) + "번째 선수 이름>>");
            String name = sc.next();
            p[i] = new P2(name);
        }

        String temp = sc.nextLine();
        while(true) {
            for(int i = 0; i < n; i++) {
                System.out.print("[" + p[i].name + "]:<Enter>");
                temp = sc.nextLine();
                if(p[i].game()) {
                    System.out.println(p[i].name + "님이 이겼습니다!");
                    sc.close();
                    return;
                }
                System.out.println("아쉽군요!");
            }
        }
    }
}
