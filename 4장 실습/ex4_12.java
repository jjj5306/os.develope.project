import java.util.*;

public class ex4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Res r = new Res();

        int option;
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            option = sc.nextInt();

            switch(option) {
                case 1:
                    r.Reserve();
                    break;
                case 2:
                    r.Check();
                    break;
                case 3:
                    r.Cancel();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}


class Res {
    Scanner sc = new Scanner(System.in);
    String[][] seat = new String[3][10];

    public Res() {
        for(String[] row: seat) {
            Arrays.fill(row, "___");
        }
    }

    public void Reserve() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int grade = sc.nextInt();
        if(grade == 1) System.out.print("S>> ");
        else if(grade == 2) System.out.println("A>> ");
        else System.out.println("B>> ");

        for(int i = 0;i < 10;i++){
            System.out.print(seat[grade-1][i]+" ");
        }
        System.out.println("");
        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int num = sc.nextInt();
        seat[grade-1][num - 1] = name;
    }

    public void Check() {
        System.out.print("S>> ");
        for(int j=0; j<10; j++)
            System.out.print(seat[0][j]+" ");
        System.out.println("");

        System.out.print("A>> ");
        for(int j=0; j<10; j++)
            System.out.print(seat[1][j]+" ");
        System.out.println("");

        System.out.print("B>> ");
        for(int j=0; j<10; j++)
            System.out.print(seat[2][j]+" ");
        System.out.println("");

        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void Cancel() {
        System.out.print("좌석 S:1, A:2, B:3>>");
        int grade = sc.nextInt();
        if(grade == 1) System.out.print("S>> ");
        else if(grade == 2) System.out.println("A>> ");
        else System.out.println("B>> ");

        for(int i = 0;i < 10;i++){
            System.out.print(seat[grade-1][i]+" ");
        }

        System.out.println("");
        System.out.print("이름>>");
        String name = sc.next();
        int flag = 0;
        for(int i = 0;i < 10;i++){
            if(seat[grade-1][i].equals(name)){
                flag = 1;
                seat[grade-1][i] = "___";
                break;
            }
        }
        if(flag == 0){
            System.out.println("없는 이름입니다.");
        }
        else{
            System.out.println("<<<취소를 완료하였습니다.>>>");
        }
    }

}
