public class MainClone {

    public static void main(String[] args) {

        try {
            Product original = new Product("Laptop", 55000);
            Product copy = (Product) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Cloned: " + copy);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}