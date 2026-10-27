class ExceptionChaining {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                throw new Exception("New Exception", e);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}