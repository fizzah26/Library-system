public class demo {
    public static void main(String[]args){
        Library lib = new Library();
        Book book1 = new Book("Moth Smoke", "Mohsin Hamid", 2000, true,247);
        Book book2 = new Book("The Reluctant Fundamentalist", "Mohsin Hamid", 2007, false,184);
        Magazine magazine1 = new Magazine("Dastaan-e-Pakistan", "History Dept", 2022, true,5);
        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(magazine1);
        System.out.println("Available Items:");
        lib.displayAvailableItems();
        System.out.println("\nBorrowed Items:");
        lib.displayBorrowedItems();


    }
}
