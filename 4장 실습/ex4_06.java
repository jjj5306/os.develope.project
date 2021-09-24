import java.util.*;

public class ex4_06 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Circl c[] = new Circl[3];
        for(int i=0; i<c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circl(x, y, radius);
        }

        int tmp = 0;
        for(int i=1; i<c.length; i++) {
            if(c[tmp].getR() < c[i].getR())
                tmp = i;
        }

        System.out.print("가장 면적이 큰 원은 ");
        c[tmp].show();
        scanner.close();
    }
}


class Circl{
    private double x, y;
    private int radius;
    public Circl(double x, double y, int radius) { // x, y, radius 초기화
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("("+x+","+y+")"+radius);
    }
    public int getR() {
        return radius;
    }
}
