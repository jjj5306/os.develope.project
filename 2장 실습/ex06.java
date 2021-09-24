import java.util.*;

public class ex06{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.printf("1~99 사이의 정수를 입력하시오>>");
    int a = sc.nextInt();
    int count = 0;
    if((a / 10) % 3 == 0) count++;
    if((a % 10) % 3 == 0) count++;
        
    switch(count){
    case 0 : break;
    case 1 : System.out.printf("박수짝");
      break;
    case 2 : System.out.printf("박수짝짝");
    }
    sc.close();
  }
}