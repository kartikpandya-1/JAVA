class ExceptionPropagation {
    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main method");
        }
    }
}