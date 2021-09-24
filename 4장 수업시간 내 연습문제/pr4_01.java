public class pr4_01 {
    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.r = 10;
        pizza.name = "자바피자";
        System.out.println(pizza.name + "의 면적은" + pizza.getArea());

        Circle donut = new Circle();
        donut.r = 2;
        donut.name = "자바도넛";
        System.out.println(donut.name + "의 면적은" + donut.getArea());
    }
}

class Circle{
    int r;
    String name;
    public Circle(){}

    public double getArea(){
        return 3.14 * r * r;
    }
}


