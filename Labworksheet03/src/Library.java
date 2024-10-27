import java.util.ArrayList;

public class Library {

    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    //Add books to the array
    public void addLibraryItem(BorrowableItems item){
        borrowableItemsList.add(item);
    }

    //Handle checkout books
    public void checkoutItem(String title){
        for(BorrowableItems item : borrowableItemsList){
            if(item instanceof Book && ((Book) item).getTitle().equalsIgnoreCase(title)){
                if(item.isAvailable()){
                    ((Book) item).setAvailable(false);
                    System.out.println(title + " has been checked out!");
                }
                else {
                    System.out.println(title + " is already checked out!");
                }
            }
        }
    }

    //Display available books
    public void listAvailableItems(){
        System.out.println("\n===Available Items in the Library===\n");
        for(BorrowableItems item: borrowableItemsList){
            if(item.isAvailable()){
                item.displayInfo();
            }
        }
    }

    //Display library information
    public void displayLibraryInfo(){
        int totItems = borrowableItemsList.size(); //Total number of book in borrowableItemsList array
        int availableItems = 0;

        for(BorrowableItems item : borrowableItemsList){
            if(item.isAvailable()){
                availableItems++;
            }
        }

        System.out.println("===Library Information===\n");
        System.out.println("Total items: " + totItems); //Display Total number of books
        System.out.println("Available items: " + availableItems); //Display Available book count
    }
}
