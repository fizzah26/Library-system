public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private static LibraryItemType type;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(LibraryItemType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public LibraryItemType getType() {
        return type;
    }

    public boolean equals(LibraryItem item) {
        if (this.equals(item)) {
            return true;
        }
        else return false;
    }


}