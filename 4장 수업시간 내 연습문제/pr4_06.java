public class pr4_06 {
    public static void main(String[] args) {
        Circle3 [] c = new Circle3[5];
        for(int i=0; i<c.length; i++)
            c[i] = new Circle3(i);

        for(int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}
class Circle3 {
    int r;
    public Circle3(int r) {
        this.r = r;
    }
    public double getArea() {
        return 3.14 * r * r;
    }
}
