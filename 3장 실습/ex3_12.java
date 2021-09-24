import java.util.*;

public class ex3_12 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum = 0;

    for(String i : args){
      try{
        sum += Integer.parseInt(i);
      }catch(NumberFormatException e){
        continue;
      }
    }
    System.out.println(sum);
    sc.close();
   }
}
