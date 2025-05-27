class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class overloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Addition of two integers: " + math.add(5, 10));
        System.out.println("Addition of three integers: " + math.add(5, 10, 15));
        System.out.println("Addition of two doubles: " + math.add(5.5, 10.5));
    }
}
