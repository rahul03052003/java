public class numberformat {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("a");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        }finally {
            System.out.println("Done");
        }

    }
}
