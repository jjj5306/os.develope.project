public class pr4_03 {
    public static void main(String[] args) {
       Circle2 pizza = new Circle2(10, "자바피자");
       System.out.println(pizza.name + "의 면적은" + pizza.getArea());

        Circle2 donut = new Circle2();
        donut.name = "도넛피자";
        System.out.println(donut.name + "의 면적은" + donut.getArea());
    }
}

class Circle2{
    int r;
    String name;

    Circle2(){
        r = 1;
        name = "";
    }
    Circle2(int r, String n){
        this.r = r;
        this.name = n;
    }
    double getArea(){
        return 3.14 * r * r;
    }
}
