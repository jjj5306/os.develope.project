import java.util.*;

public class ex4_02 {
    public static void main(String[] args) {
        Grade g = new Grade();
        System.out.println("평균은" + (int)g.average());
    }
}

class Grade{
    private int math, science, english;

    Grade(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        math = sc.nextInt();
        science = sc.nextInt();
        english = sc.nextInt();
        sc.close();
    }

    float average(){
        return ((float)math+science+english)/(float)3.0;
    }
}
