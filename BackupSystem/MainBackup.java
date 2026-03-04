public class MainBackup {

    public static void main(String[] args) {

        UserData user = new UserData("Rishi", 19);

        if (user instanceof java.io.Serializable) {
            System.out.println("UserData is ready for backup.");
        } else {
            System.out.println("UserData is not serializable.");
        }

        System.out.println(user);
    }
}