import java.util.*;

public class ex08{
  public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) { 
    if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) 
      return true; 
    else 
      return false;
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.printf("점 (x1, y1)의 좌표를 입력하시오>>");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    System.out.printf("점 (x2, y2)의 좌표를 입력하시오>>");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    
    if(inRect(x1, y1, 100, 100, 200, 200) ||
    inRect(x2, y2, 100, 100, 200, 200) ||
    inRect(x1, y2, 100, 100, 200, 200) ||
    inRect(x2, y1, 100, 100, 200, 200))
      System.out.printf("직사각형과 충돌합니다.");
    else System.out.printf("직사각형과 충돌하지 않습니다.");
    
    sc.close();
  }
}