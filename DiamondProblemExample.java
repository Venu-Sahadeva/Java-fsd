package com;
interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

// Interface B extends A
interface B extends A {
    // no additional methods here
}

// Interface C extends A
interface C extends A {
    // no additional methods here
}

// Class D implements both B and C
class D implements B, C {
    // Class D doesn't need to provide an implementation for display(),
    // as it inherits it from both B and C (which extend A)
}

public class DiamondProblemExample {
    public static void main(String[] args) {
        D d = new D();
        d.display(); // Calls the default implementation from Interface A
    }
}

