import java.util.*;

public class pr4_07 {
    public static void main(String[] args) {
        Book3 [] book = new Book3[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < book.length; i++) {
            System.out.print("제목>>");
            String title = sc.nextLine();
            System.out.print("저자>>");
            String author = sc.nextLine();
            book[i] = new Book3(title, author);
        }
        for(int i=0; i < book.length; i++)
            System.out.print("(" + book[i].title + ", " + book[i].author + ")");
        sc.close();
    }
}

class Book3 {
    String title, author;
    public Book3(String title, String author) {
        this.title= title;
        this.author= author;
    }
}
