public class LW3Q1 {

    public static void main(String[] args) {

        //Create book objects
        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        //Create Library object
        Library libHandler = new Library();

        //Add books to the library
        libHandler.addLibraryItem(b1);
        libHandler.addLibraryItem(b2);
        libHandler.addLibraryItem(b3);

        //Display library information
        libHandler.displayLibraryInfo();

        //Display available book details
        libHandler.listAvailableItems();

        //Checkout book
        libHandler.checkoutItem("Island of a Thousand Mirrors");

        //Display remaining books in the library
        libHandler.listAvailableItems();
    }
}
