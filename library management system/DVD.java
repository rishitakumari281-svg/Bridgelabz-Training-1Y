class DVD extends LibraryItem implements Reservable {

    private boolean available = true;
    private String reservedBy;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    int getLoanDuration() {
        return 5;
    }

    public void reserveItem(String user) {
        if (available) {
            reservedBy = user;
            available = false;
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}
