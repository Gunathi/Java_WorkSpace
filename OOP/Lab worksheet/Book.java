public class Book extends BorrowableItems {

    String title;
    String author;
    String ISBN;
    boolean available;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo(){
        System.out.println("Information of the book...");
        System.out.println("Title of the book "+this.title);
        System.out.println("Author of the book "+this.author);
        System.out.println("ISBN no of the book "+ this.ISBN);
        if(this.available) {
            System.out.println("This book is available");
        }else {
            System.out.println("This book isn't available");
        }
    }


}
