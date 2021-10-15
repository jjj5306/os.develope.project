import java.util.*;

class Player {
    Calendar cur = Calendar.getInstance();
    Scanner sc = new Scanner(System.in);
    private String name, buffer;
    private int t1, t2;

    public Player(String name) {
        this.name = name;
    }

    public int game() {
        System.out.print(name+" 시작 <Enter>키  >>");
        t1 = push();
        System.out.print("10초 예상 후 <Enter>키  >>");
        t2 = push();
        if(t1 < t2)
            return t2 - t1;
        else
            return (60 - t1) + t2;
    }

    public int push() {
        buffer = sc.nextLine();
        cur = Calendar.getInstance();
        System.out.println("\t현재 초 시간 = "+ cur.get(Calendar.SECOND));
        return cur.get(Calendar.SECOND);
    }
}
public class ex6_06 {
    public static void main(String[] args) {
        Player p1 = new Player("황기태");
        Player p2 = new Player("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int r1 = p1.game();
        int r2 = p2.game();

        if(Math.abs(r1 - 10) == Math.abs(r2 - 10)) System.out.println("황기태의 결과 " + r1 + ", 이재문의 결과 " + r2 + ", 비겼습니다.");
        else if(Math.abs(r1 - 10) < Math.abs(r2 - 10))
            System.out.println("황기태의 결과 " + r1 + ", 이재문의 결과 " + r2 + ", 승자는 황기태");
        else if(Math.abs(r1 - 10) > Math.abs(r2 - 10))
            System.out.println("황기태의 결과 " + r1 + ", 이재문의 결과 " + r2 + ", 승자는 이재문");
    }
}
