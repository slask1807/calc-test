import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testsumdouble() {
        Calc calc = new Calc();
        double actual = calc.sum(4, 5.9);
        Assertions.assertEquals(9.1, actual);
    }

    @Test
    public void testsuminteger() {
        Calc calc = new Calc();
        int actual = calc.sum(4, 8);
        Assertions.assertEquals(12, actual);
    }

    @Test
    public void testmultiply() {
        Calc calc = new Calc();
        int actual = calc.multiply(2, 8);
        Assertions.assertEquals(16, actual);
    }

    @Test
    public void testsubtract() {
        Calc calc = new Calc();
        double actual = calc.subtract(4.8, 5);
        Assertions.assertEquals(-0.20000000000000018, actual);
    }
}
