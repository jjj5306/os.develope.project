import java.util.*;

public class ex10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("첫 번째 원의 중심과 반지름 입력>>");
    int x1= sc.nextInt();
    int y1= sc.nextInt();
    double r1 = sc.nextDouble();

    System.out.printf("두 번째 원의 중심과 반지름 입력>>");
    int x2= sc.nextInt();
    int y2= sc.nextInt();
    double r2 = sc.nextDouble();

    double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    if(dist <= r1+r2)
      System.out.printf("두 원은 서로 겹친다.");
    else 
      System.out.printf("두 원은 서로 겹치지 않는다.");


    sc.close();
  }
}