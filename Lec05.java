public class Lec05 {
    public static void main(String[] args) {
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();

        System.out.println("---");

        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);

        System.out.println("Full display (true):");
        nicolas.displayInfo(true);

        System.out.println("\nShort display (false):");
        nicolas.displayInfo(false);

        System.out.println("\n");
        User Tom = new User();
        Tom.displayInfo();

    }
}