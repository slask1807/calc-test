

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.sum(4,5.9));
        System.out.println(calc.sum(5.1,5));

        System.out.println(calc.subtract(4.8,5));
        System.out.println(calc.multiply(2147483647,5.5));
        System.out.println(calc.divide(4.1,2));
    }
}