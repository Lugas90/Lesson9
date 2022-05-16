public class Main {

    public static void main(String[] args) {
        BookAuthor bookAuthor1 = new BookAuthor("Лев", "Толстой");
        BookAuthor bookAuthor2 = new BookAuthor("Ричард", "Докинз");
        Book book1 = new Book("Война и мир", bookAuthor1, 1873);
        Book book2 = new Book("Бог как иллюзия", bookAuthor2, 2006);
        System.out.println("bookAuthor1 = " + bookAuthor1.getNameAuthor() + " " + bookAuthor1.getSurnameAuthor());
        System.out.println("bookAuthor2 = " + bookAuthor2.getNameAuthor() + " " + bookAuthor2.getSurnameAuthor());
        System.out.println("book1 = " + book1.getTitle() + ", " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurnameAuthor() + ", " + book1.getYearPublisher());
        System.out.println("book2 = " + book2.getTitle() + ", " + book2.getAuthor().getNameAuthor() + " " + book2.getAuthor().getSurnameAuthor() + ", " + book2.getYearPublisher());
        book2.setYearPublisher(2010);
        System.out.println("book2.getYearPublisher() = " + book2.getYearPublisher());
    }
}