public class pr7_10 {
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<T>();
        while (true) {
            T tmp;
            tmp= a.pop(); // 원래스택에서요소하나를꺼냄
            if (tmp==null) // 스택이비었음
                break;
            else
                s.push(tmp); // 새스택에요소를삽입
        }
        return s; // 새스택을반환
    }

    public static void main(String[] args) {
        GStack<Double> gs = new GStack<Double>();

        for (int i=0; i < 5; i++) {
            gs.push(new Double(i));
        }

        gs= reverse(gs);
        for (int i=0; i < 5; i++) {
            System.out.println(gs.pop());
        }
    }
}
