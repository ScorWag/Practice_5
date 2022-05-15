import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void rangeWithValidValues() {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeOfAllNum() {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(0, 10_000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeWithLimitValues() {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(100, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeWithOverLimitValues() {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(81, 10_000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void limitValuesInsideRange() {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(121, 9_604);
        int expected = 88;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroValues() {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(0, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeWithMinusValues() {
        SQRService service = new SQRService();

        int actual = service.calculateSqr(-300, -200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
