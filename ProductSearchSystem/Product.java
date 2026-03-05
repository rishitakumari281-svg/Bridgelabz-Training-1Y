class Product {

    int productId;
    String productName;

    boolean isMatch(String keyword) {

        if(productName.contains(keyword)) {
            return true;
        }

        return false;
    }
}