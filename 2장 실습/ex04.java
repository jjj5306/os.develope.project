import java.util.*;

public class ex04{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.printf("정수 3개 입력>>");
    int a = sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt(); 
    if(a >= b && a >= c) 
      if(b >= c)
       System.out.printf("중간 값은 %d", b);
      else
        System.out.printf("중간 값은 %d", c);
    else if(b >= a && b >= c)
      if(a >= c)
        System.out.printf("중간 값은 %d", a);
      else
        System.out.printf("중간 값은 %d", c);
    else if(c >= a && c >= b)
      if(a >= b)
        System.out.printf("중간 값은 %d", a);
      else
        System.out.printf("중간 값은 %d", b);
        
    sc.close();
  }
}