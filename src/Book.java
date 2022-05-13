public class Book {
    private String title;
    private String author;
    private int yearPublisher;


    public Book(String title, String author, int yearPublisher) {
        this.title = title;
        this.author = author;
        this.yearPublisher = yearPublisher;
    }
    public String getTitle (){
        return this.title;
    }
    public String getAuthor (){
        return  this.author;
    }
    public int getYearPublisher(){
        return this.yearPublisher;
    }
    public void setYearPublisher(int yearPublisher){
        this.yearPublisher = yearPublisher;
    }

}
