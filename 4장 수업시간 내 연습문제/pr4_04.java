class Book{
    String title, author;

    Book(String t){
        this.title = t;
        this.author = "작자미상";
    }
    Book(String t, String a){
        this.title = t;
        this.author = a;
    }
}

public class pr4_04 {
    public static void main(String[] args) {
        Book littlePrince= new Book("어린왕자", "생텍쥐페리");
        Book loveStory= new Book("춘향전");
        System.out.println(littlePrince.title+ " " + littlePrince.author);
        System.out.println(loveStory.title+ " " + loveStory.author);
    }
}
