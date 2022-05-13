public class BookAuthor {
    private String nameAuthor;
    private String surnameAuthor;

    public BookAuthor (String nameAuthor, String surnameAuthor){
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getNameAuthor (){
        return this.nameAuthor;
    }
    public String getSurnameAuthor() {
        return surnameAuthor;
    }
}

