import java.util.*;

public class ex3_16 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str[] = {"scissors", "rock", "paper"};
      String User, Com;
      int n;
      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
      while(true) {
         System.out.print("가위 바위 보! >> ");
         User = sc.next();

         if(User.equals("stop")) break;

         n = (int)(Math.random()*3);
         Com = str[n];

         if(User.equals("scissors")) {
            if(str[n].equals("scissors")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 비겼습니다.");
            else if(str[n].equals("rock")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com+ " 사용자가 졌습니다.");
            else if(str[n].equals("paper")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 사용자가 이겼습니다.");
         }
         else if(User.equals("rock")) {
            if(str[n].equals("scissors")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 사용자가 이겼습니다.");
            else if(str[n].equals("rock")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 비겼습니다.");
            else if(str[n].equals("paper")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 사용자가 졌습니다.");
         }
         else if(User.equals("paper")) {
            if(str[n].equals("scissors")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 사용자가 졌습니다.");
            else if(str[n].equals("rock")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 사용자가 이겼습니다.");
            else if(str[n].equals("paper")) 
               System.out.println("사용자 = " + User + " , 컴퓨터 = " + Com + " 비겼습니다.");
         }
         System.out.print("사용자 = " + User + " , 컴퓨터 = " + Com + " ");
      }

      System.out.println("게임을 종료합니다...");
      sc.close();
   }

}