public class DVD extends LibraryItem<String> {
    private int duration; // in minutes
    public DVD(String title, String author, String itemID, int duration) {
        super(title, author, itemID);
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " mins";
    }
}
