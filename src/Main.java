public class Main {
    public static void main(String[] args) {
        Casino casino = Casino.getInstance();
        System.out.println(casino.getNewListOfTosses());
    }
}