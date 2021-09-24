import java.util.Scanner;

public class ex4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        Dictionary dic = new Dictionary();
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글 단어?");
            word = sc.next();
            if(word.equals("그만")) break;

            String result = Dictionary.kor2Eng(word);
            if(result==null)
                System.out.println(word+"는 저의 사전에 없습니다.");
            else
                System.out.println(word+"는 "+result);
        }
    }
}

class Dictionary {
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };
    public static String kor2Eng(String word) {
        for(int i=0; i<kor.length; i++) {
            if(word.equals(kor[i])) {
                return eng[i];
            }
        }
        return null;
    }
}