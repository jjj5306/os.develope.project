import java.util.*;

public class pr7_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();

        for(int i=0; i < 4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = sc.next();
            a.add(s);
        }

        for(int i=0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.print(name + " ");
        }
        int longestIndex= 0;
        for(int i=1; i < a.size(); i++) {
            if(a.get(longestIndex).length() < a.get(i).length())
                longestIndex= i;
        }
        System.out.println("\n가장 긴 이름은: " + a.get(longestIndex));
        sc.close();
    }
}
