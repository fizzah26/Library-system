public class Library {
    LibraryItem libraryItems[];

    public void addItem(LibraryItem item) {
        for (int i = 0; i < libraryItems.length;i++) {
            if (libraryItems[i] != null )
                this.libraryItems[i] = item;
        }
    }

    public void displayAvailableItems () {
        for (int i = 0; i < libraryItems.length; i++)
            System.out.println(libraryItems[i]);
    }

    public void displayBorrowedItems(){

    }

}
