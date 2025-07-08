public class nullpointer {
    public static void main(String[] args) {
        try {
            String text = "Null";
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }

    }
}
