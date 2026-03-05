public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.productId = 101;
        p1.productName = "Notebook";

        ElectronicProduct p2 = new ElectronicProduct();
        p2.productId = 201;
        p2.productName = "Smartphone";
        p2.brand = "Samsung";

        System.out.println("Search 'Note': " + p1.isMatch("Note"));
        System.out.println("Search 'Samsung': " + p2.isMatch("Samsung"));
    }
}