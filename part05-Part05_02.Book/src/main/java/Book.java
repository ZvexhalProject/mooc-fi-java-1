public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String initialAuthor, String initialTitle, int initialPageCount){
        this.author=initialAuthor;
        this.title=initialTitle;
        this.pageCount=initialPageCount;
    }
    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.title;
    }
    public int getPages(){
        return this.pageCount;
    }

    @Override
    public String toString() {
        return this.author+", "+this.title+", "+this.pageCount+" pages";
    }
    
}
