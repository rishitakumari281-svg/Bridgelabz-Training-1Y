public class MainConversion {

    public static void main(String[] args) {

        double miles = UnitConverter.kmToMiles(10);
        double pounds = UnitConverter.kgToLbs(5);

        System.out.println("10 km in miles: " + miles);
        System.out.println("5 kg in pounds: " + pounds);
    }
}