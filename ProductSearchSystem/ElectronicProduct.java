class ElectronicProduct extends Product {

    String brand;

    boolean isMatch(String keyword) {

        if(productName.contains(keyword) || brand.equalsIgnoreCase(keyword)) {
            return true;
        }

        return false;
    }
}