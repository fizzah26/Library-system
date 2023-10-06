public class Magazine extends LibraryItem{
    int issueNumber;

    public Magazine(String title, String author,int year, boolean isBorrowed,int issueNumber){
        super(title,author,year);
        this.issueNumber=issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
