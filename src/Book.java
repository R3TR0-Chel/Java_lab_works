public class Book {
    private String title;
    private String author;
    private int numOfPages;

    public Book(String title,String author,int num){
        this.title = title;
        this.author = author;
        this.numOfPages = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }




}

class Mainbook{
    public static void main(String [] args){
        Book b2 = new Book("Lord of the Ring","Tolkien",456);
        System.out.println("info about book: "+b2.getAuthor()+" "+b2.getTitle()+" "+b2.getNumOfPages());
    }

}
