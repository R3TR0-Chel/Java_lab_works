import java.util.Scanner;

public class Library_menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать книги");
            System.out.println("2. Добавить книгу");
            System.out.println("3. Взять книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Поменять книгу");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Доступные книги:");
                    library.showAvaibleBooks();
                    break;
                case 2:
                    System.out.print("Введите автора: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    library.AddBooktoConteiner(new Book(author, title, true));
                    System.out.println("Книга добавлена!");
                    break;
                case 3:
                    System.out.print("Введите название книги для взятия: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    System.out.println("Книга взята!");
                    break;
                case 4:
                    System.out.print("Введите название книги для возврата: ");
                    String returnTitle = scanner.nextLine();
                    for (Book book : library.getConteiner()) {
                        if (book != null && book.getTitle().equals(returnTitle)) {
                            book.setAvaible("Returend");
                            System.out.println("Книга возвращена!");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Введите название книги, которую хотите заменить: ");
                    String oldTitle = scanner.nextLine();
                    System.out.print("Введите автора новой книги: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Введите название новой книги: ");
                    String newTitle = scanner.nextLine();
                    library.replaceBook(oldTitle, new Book(newAuthor, newTitle, true));
                    System.out.println("Книга заменена!");
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }
    }
}


class Book{
    private String author;
    private String title;
    private boolean isAvaible;

    public Book(String author, String title, boolean isAvaible) {
        this.author = author;
        this.title = title;
        this.isAvaible = isAvaible;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsAvaible() {
        return isAvaible;
    }

    public void setAvaible(String status) {
        if (status.equals("Returend")){
            this.isAvaible = true;
        }
        else {
            this.isAvaible = false;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class Library{
    private Book [] conteiner = new Book [10];
    private int [] avaible_index = new int [10];

    public Book[] getConteiner() {
        return conteiner;
    }

    public int getAvaibleIndex(){
        for(int i = 0; i<this.avaible_index.length;i++){
            if (this.avaible_index[i] == 0){
                return i;
            }
        }
        return 100;
    }

    public void AddBooktoConteiner(Book newBook) {
        int index = this.getAvaibleIndex();
        if (index == 100){
            System.out.println("No empty slots");
        }
        else {
            this.conteiner[index]=newBook;
            this.avaible_index[index]=1;
        }
    }

    public void showAvaibleBooks() {
        for (int i = 0; i < this.conteiner.length; i++) {
            if (conteiner[i] == null) { // Проверяем сначала, не null ли элемент
                continue;
            }
            if (conteiner[i].getIsAvaible()) {
                System.out.println(conteiner[i].getTitle());
            }
        }
    }

    public void borrowBook(String title){
        for(int i = 0; i< this.conteiner.length; i++){
            if(conteiner[i].getIsAvaible() && conteiner[i].getTitle().equals(title)){
                conteiner[i].setAvaible("borrow");
                break;
            }
        }
    }

    public void replaceBook(String old_title,Book newBook){
        for(int i = 0; i< this.conteiner.length; i++){
            if(conteiner[i].getTitle().equals(old_title)){
                conteiner[i] = newBook;
            }
        }
    }
}
