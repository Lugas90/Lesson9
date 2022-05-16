public class Book {
    private String title;
    private BookAuthor author;
    private int yearPublisher;


    public Book(String title, BookAuthor author , int yearPublisher) {
        this.title = title;
        this.yearPublisher = yearPublisher;
        this.author = author;
    }
    public String getTitle (){
        return this.title;
    }
    public int getYearPublisher(){
        return this.yearPublisher;
    }
    public BookAuthor getAuthor(){
        return this.author;
    }

    public void setYearPublisher(int yearPublisher){
        this.yearPublisher = yearPublisher;
    }

}
