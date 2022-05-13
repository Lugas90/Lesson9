public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Николаевич Толстой", 1873);
        Book book2 = new Book("Бог как иллюзия", "Ричард Докинз", 2006);
        BookAuthor bookAuthor1 = new BookAuthor("Лев", "Толстой");
        BookAuthor bookAuthor2 = new BookAuthor("Ричард", "Докинз");
        System.out.println("book1 = " + book1.getTitle() + ", " + book1.getAuthor() + ", " + book1.getYearPublisher());
        System.out.println("book2 = " + book2.getTitle() + ", " + book2.getAuthor() + ", " + book2.getYearPublisher());
        System.out.println("bookAuthor1 = " + bookAuthor1.getNameAuthor() + " " + bookAuthor1.getSurnameAuthor());
        System.out.println("bookAuthor2 = " + bookAuthor2.getNameAuthor() + " " + bookAuthor2.getSurnameAuthor());
        book2.setYearPublisher(2010);
        System.out.println("book2.getYearPublisher() = " + book2.getYearPublisher());
    }
}