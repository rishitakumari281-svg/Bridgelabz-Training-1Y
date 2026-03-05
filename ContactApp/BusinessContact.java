class BusinessContact extends Contact {

    String companyName;

    void display() {
        System.out.println(name.toUpperCase() + " - " + phoneNumber + " - " + companyName);
    }
}