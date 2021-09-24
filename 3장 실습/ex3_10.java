import java.util.*;

public class ex3_10 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[4][4];
      int col, row, result=0;

      while(result < 10) {
         col = (int)(Math.random()*4);
         row = (int)(Math.random()*4);
         if(arr[row][col]==0) {
            arr[row][col] = (int)(Math.random() * 10 + 1);
            result++;
         }
      }
      
      for(int[] i : arr ) {
         for(int j : i) {
            System.out.print(j + " ");
         }
         System.out.println();
      }

    sc.close();
   }
}
