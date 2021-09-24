import java.util.*;

public class ex3_08 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.printf("정수 몇개?");
    int count = sc.nextInt();

    int res[] = new int[count];

    for(int i = 0; i < res.length; i++){
    int temp = (int)(Math.random() * 100 + 1);
    int flag = 0;
      for(int j = 0; j <= i; j++){
        if(temp == res[i]){
          flag = 1;
          break;
        }
        if(flag == 1){
          i--;
          continue;
        }
        res[i] = temp;
      }
    }

    for(int i=0; i<res.length; i++) {
      if(i%10 == 0 && i != 0) System.out.println();
      System.out.print(res[i] + " ");
   }

    sc.close();
  }
}
