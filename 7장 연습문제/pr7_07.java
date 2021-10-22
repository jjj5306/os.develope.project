import java.util.*;

public class pr7_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> map = new HashMap<String, Student>();

        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이재문", new Student(2, "010-222-2222"));
        map.put("김남윤", new Student(3, "010-333-3333"));

        while(true) {
            System.out.print("검색할 이름?");
            String name = sc.nextLine();

            if(name.equals("exit"))
                break;

            Student student= map.get(name);
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id : " + student.getId() + ", 전화 : " + student.getTel());
        }
        sc.close();
    }
}

class Student {
    int id;
    String tel;
    public Student(int id, String tel) {
        this.id = id; this.tel = tel;
    }
    public int getId(){
        return id;
    }
    public String getTel(){
        return tel;
    }
}

