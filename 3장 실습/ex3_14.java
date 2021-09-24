import java.util.*;

public class ex3_14 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    String course[] = {"Java", "C++", "HTML5", "computerscience", "android"};
    int score[] = {95, 88, 76, 62, 55};

    while(true){
      String name = "";
      System.out.print("과목 이름>>");
      name = sc.next();
      int flag = 0;
      if(name.equals("stop")) break;

      for(int i = 0; i < course.length; i++){
        if(course[i].equals(name)){
          flag = 1;
          System.out.println(course[i] + "의 점수는 " + score[i]);
          break;
        }
      }

      if(flag == 0) 
        System.out.println("없는 과목입니다.");
    }

    sc.close();
   }
}
