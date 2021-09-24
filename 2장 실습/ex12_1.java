import java.util.*;

public class ex12_1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("연산>>");
    int n1 = sc.nextInt();
    String op = sc.next(); 
    int n2 = sc.nextInt();

    int res = 0;
    if(op.equals("+"))
      res = n1 + n2;
    else if(op.equals("-"))
      res = n1 - n2;
    else if(op.equals("*"))
      res = n1 * n2;
    else if(op.equals("/")){
      if(n2 == 0){
        System.out.printf("0으로 나눌 수 없습니다.");
        sc.close();
        return;
      }
      else 
        res = n1 / n2;
    }
    else{
      System.out.printf("Error!");
      sc.close();
      return;
    }
    System.out.printf("%d%s%d의 계산 결과는 %d", n1, op, n2, res);
    sc.close();
  }
}