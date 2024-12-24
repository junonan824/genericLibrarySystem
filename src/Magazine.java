public class Magazine extends LibraryItem<String> {
    private String issue;
    public Magazine(String title, String author, String itemID, String issue) {
        super(title, author, itemID);
        this.issue = issue;
    }
    public String getIssue() {
        return issue;
    }
    @Override
    public String toString() {
        return super.toString() + ", Issue: " + issue;
    }
}
