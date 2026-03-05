public class ContactTest {

    public static void main(String[] args) {

        Contact c1 = new Contact();
        c1.name = "Rishi";
        c1.phoneNumber = "9876543210";

        BusinessContact c2 = new BusinessContact();
        c2.name = "Amit";
        c2.phoneNumber = "9123456780";
        c2.companyName = "TCS";

        c1.display();
        c2.display();
    }
}