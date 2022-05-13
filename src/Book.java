public class Book {
    private String title;
    private BookAuthor author;
    private int yearPublisher;


    public Book(String title, BookAuthor author , int yearPublisher) {
        this.title = title;
        this.yearPublisher = yearPublisher;
    }
    public String getTitle (){
        return this.title;
    }
    public int getYearPublisher(){
        return this.yearPublisher;
    }
    public void setYearPublisher(int yearPublisher){
        this.yearPublisher = yearPublisher;
    }

}
