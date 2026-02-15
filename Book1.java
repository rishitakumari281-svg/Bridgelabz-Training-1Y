class Book1 {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book1 {
    void display() {
        System.out.println(ISBN);
        System.out.println(title);
    }
}
