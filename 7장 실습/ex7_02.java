import java.util.*;

public class ex7_02 {
    public static void main(String[] args) {
        ArrayList<Character> stack = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");

        for(int i=0; i<6; i++) {
            char c = sc.next().charAt(0);
            stack.add(c);
        }

        int res = 0;

        for(int i = 0; i < stack.size(); i++) {
            char c = stack.get(i);
            switch(c) {
                case 'A':
                    res +=4;
                    break;
                case 'B':
                    res +=3;
                    break;
                case 'C':
                    res +=2;
                    break;
                case 'D':
                    res +=1;
                    break;
                default:
                    break;
                }
            }

            double avr = (double)res / stack.size();

            System.out.println(avr);
            sc.close();
    }
}
