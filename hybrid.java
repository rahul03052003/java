class A {
    void methodA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Class B method");
    }
}

class C extends A {
    void methodC() {
        System.out.println("Class C method");
    }
}

class D extends B {
    void methodD() {
        System.out.println("Class D method");
    }
}

public class hybrid {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); // Inherited from A via B
        obj.methodB(); // Inherited from B
        obj.methodD(); // Defined in D

        C obj2 = new C();
        obj2.methodA(); // Inherited from A
        obj2.methodC(); // Defined in C
    }
}


o/p-
  Class A method
Class B method
Class D method
Class A method
Class C method
