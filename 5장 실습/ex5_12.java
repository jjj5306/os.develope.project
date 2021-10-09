import java.util.*;

public class ex5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        int order = 0;
        Shape start = null;
        Shape end = null;
        int count = 0;

        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            order = sc.nextInt();
            switch (order){
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    order = sc.nextInt();
                    Shape s = null;
                    switch (order){
                        case 1: s = new Line();
                            s.setNext(null);
                            break;
                        case 2: s = new Rect();
                            s.setNext(null);
                            break;
                        case 3:
                            s = new Circle();
                            s.setNext(null);
                            break;
                    }
                    if(start == null) {
                        start = s;
                        end = s;
                    }
                    else{
                        end.setNext(s);
                        end = s;
                    }
                    count++;
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int temp = sc.nextInt();
                    if(temp > count) System.out.println("삭제할 수 없습니다.");
                    else{
                        Shape cur = start;
                        Shape tmp = start;
                        int i;
                        if( temp == 1) {
                            if(start == end) { // 노드가 한개 일경우
                                start = null;
                                end = null;
                                return;
                            }
                            else { // 노드가 두개 이상
                                start = start.getNext();
                                return;
                            }
                        }
                        for(i=1; i<temp; i++) {
                            tmp = cur;
                            cur = cur.getNext();
                        }
                        if(temp == i) { // 끝 노드를 가리킬때
                            tmp.setNext(cur.getNext());
                            end = tmp;
                        }
                        else
                            tmp.setNext(cur.getNext());
                    }
                    break;
                case 3:
                    Shape s3 = start;
                    while(s3 != null) {
                        s3.draw();
                        s3 = s3.getNext();
                    }
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    return;
            }
        }

    }
}

abstract class Shape {
    private Shape next;

    public Shape() {
        next = null;
    }
    public void setNext(Shape obj){
        next = obj;
    }
    public Shape getNext() {
        return next;
    }
    public abstract void draw();
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
