import java.util.*;

public class pr4_02 {
    public static void main(String[] args) {
        Rectangl rect = new Rectangl();
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");

        rect.width = sc.nextInt();
        rect.height = sc.nextInt();

        System.out.println("사각형의 면적은" + rect.getArea());
        sc.close();
    }
}

class Rectangl{
    public int width, height;

    int getArea(){
        return width * height;
    }
}
