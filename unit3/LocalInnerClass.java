class LocalInnerClass {
    void display() {
        class Inner {
            void show() {
                System.out.println("This is a local inner class");
            }
        }

        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }
}