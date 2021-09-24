import java.util.*;

public class ex02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("2자리수 정수 입력(10~90)>>");
    int i= sc.nextInt();
    if(i % 10 == i / 10) 
      System.out.printf("Yes! 10의 자리와 1의 자리가 같습니다.");
    else
      System.out.printf("No! 10의 자리와 1의 자리가 다릅니다.");
    sc.close();
  }
}