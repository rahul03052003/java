public class shift {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Left Shift(5<<1): "+(n<<1));
        System.out.println("Right Shift(10>>1): "+(10>>1));
        int neg=-10;
        System.out.println("Unsigned right shift(-10 >>> 1): "+(neg>>>1));
    }
}
