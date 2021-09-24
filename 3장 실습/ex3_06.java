import java.util.*;

public class ex3_06 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.printf("금액을 입력하시오>>");
    int cost = sc.nextInt();

    int []unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

    for(int i =0; i<unit.length; i++){
      if(cost / unit[i] != 0)
        System.out.println(unit[i] + "원 짜리 : " + cost / unit[i] + "개");
      cost = cost % unit[i];
    }

    sc.close();
  }
}
