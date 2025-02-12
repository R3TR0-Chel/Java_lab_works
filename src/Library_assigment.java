public class Library_assigment {
    public static void main(String[] args) {
        Book b1 = new Book("Hobbit","Tolkien",1954);
        b1.printBookDetail();
        System.out.println(b1.getBookInfo());
        System.out.println();
        PrintedBook b2 = new PrintedBook("The Great Gatsby","F. Scott Fizgeral",1925,218,"Scribner",2.90);
        b2.printBookDetail();
        b2.Booktype();
        System.out.println();
        EBook b3 = new EBook("Java Programming for Beginners","John Smith",2020,4.5,"PDF",1.1);
        b3.printBookDetail();
        b3.Booktype();
        System.out.println();
        System.out.println("exsample of additional challenges");
        PrintBook(b2);
        b2.BookCost();
        b3.BookPrice();
    }

    static void PrintBook(PrintedBook book){
        System.out.println("Printing book....");
    }

}

class Book{
    private String title;
    private String author;
    private int yearPublished;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void printBookDetail(){
        System.out.println("title: "+title+"\n"+"author: "+author+"\n"+"year published: "+yearPublished);

    }

    public String getBookInfo(){
        return title+" "+author+" "+yearPublished;
    }




}

class PrintedBook extends Book{
    private String publisher;
    private int numberofPages;
    private double price;

    public PrintedBook(String title, String author, int yearPublished, int nOfp,String p,double price) {
        super(title, author, yearPublished);
        this.numberofPages = nOfp;
        this.publisher = p;
        this.price = price;
    }
    @Override
    public String getBookInfo(){
        return getTitle()+" "+getAuthor()+" "+getYearPublished()+" "+numberofPages+" "+publisher;
    }

    @Override
    public void printBookDetail(){
        System.out.println("title: "+getTitle()+"\n"+"author: "+getAuthor()+"\n"+"year published: "+getYearPublished()+"\n"+"nummer of pages: "+numberofPages+"\n"+"publisher: "+publisher);

    }

    public void Booktype(){
        System.out.println("Book type: printed book");
    }

    public void BookCost(){
        System.out.println("$"+price*numberofPages);
    }


}

class EBook extends Book{
    private double fileSizeMB;
    private String fileFormat;
    private double price;

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat,double price) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = price;
    }

    @Override
    public void printBookDetail(){
        System.out.println("title: "+getTitle()+"\n"+"author: "+getAuthor()+"\n"+"year published: "+getYearPublished()+"\n"+"file size: "+fileSizeMB+"MB"+"\n"+"file format: "+fileFormat);

    }

    @Override
    public String getBookInfo(){
        return getTitle()+" "+getAuthor()+" "+getYearPublished()+" "+fileFormat+" "+fileFormat;
    }

    public void Booktype(){
        System.out.println("Book type: EBook");
    }

    public void BookPrice(){
        System.out.println("$"+price*fileSizeMB);
    }


}