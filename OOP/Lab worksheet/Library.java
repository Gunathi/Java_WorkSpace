import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<BorrowableItems> BorrowableItemsList;

    public Library(){
        BorrowableItemsList = new ArrayList<BorrowableItems>();
    }

    public void addItem(BorrowableItems b){
        BorrowableItemsList.add(b);
    }

    public void checkOutBooks(BorrowableItems item){
        if(BorrowableItemsList.contains(item)){
            item.setAvailable(false);
        }
    }

    public void listAvailableItems(){
        for(BorrowableItems item : BorrowableItemsList){
            if(item.isAvailable()){
                item.displayInfo();
            }
            System.out.println();
        }
    }

    public void libraryInfo(){
        int count = 0;
        for(BorrowableItems item : BorrowableItemsList){
            if(item.isAvailable()){
                count++;
            }
        }

        System.out.println("We are Library of Kelaniya...");
        System.out.println("No of books available in the library : " + count);
        System.out.println("Open at : 8.30 a.m");
        System.out.println("Closed at : 10.00 p.m");
    }
}
