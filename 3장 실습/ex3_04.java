import java.util.*;

public class ex3_04 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.printf("소문자 알파벳 하나를 입력하시오>>");
    
    String s = sc.next();
    char c = s.charAt(0);
    int line = c - 'a';
    
    for(int i = 0; i <= line; i++){
      for(int j = 'a'; j <= (int)c; j++)
        System.out.printf("%c",j);
      System.out.printf("\n");
      c--;
    }

    sc.close();
  }
}
