public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);


        Library l = new Library();

        l.addItem(b1);
        l.addItem(b2);
        l.addItem(b3);

        l.libraryInfo();

        l.listAvailableItems();

        l.checkOutBooks(b3);
        System.out.println("New available books....");
        l.listAvailableItems();
    }
}
