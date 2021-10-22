import java.util.*;

public class pr7_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dic= new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        while(true) {
            System.out.print("찾고싶은단어는?");
            String eng= sc.next();
            if(eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            String kor= dic.get(eng);
            if(kor== null)
                System.out.println(eng + "는 없는 단어 입니다.");
            else
                System.out.println(kor);
        }
        sc.close();
    }
}
