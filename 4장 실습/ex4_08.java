import java.util.*;

public class ex4_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int count = sc.nextInt();

        Phone pb[] = new Phone[count];

        for(int i =0;i < count;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력>>");
            pb[i] = new Phone();
            pb[i].name = sc.next();
            pb[i].tel = sc.next();
        }
        System.out.println("저장되었습니다...");

        while(true) {
            int flag = 0;
            System.out.print("검색할 이름>>");
            String name = sc.next();
            if(name.equals("그만")) break;
            for(int i =0;i < count;i++){
                if(pb[i].name.equals(name)) {
                    flag = 1;
                    System.out.println(pb[i].name + "의 번호는 " + pb[i].tel + "입니다.");
                    break;
                }
            }
            if(flag == 0)
                System.out.println(name + "이 없습니다.");
        }

        sc.close();
    }
}

class Phone{
    String name;
    String tel;
    Phone(){}
}
