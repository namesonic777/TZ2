import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationsTests {

    @Test
    void testMin() {
        List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
        Assertions.assertEquals(-77, Operations.getMin(numbers));
    }

    @Test
    void testMax() {
        List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
        Assertions.assertEquals(77, Operations.getMax(numbers));
    }
    @Test
    void testSum() {
        List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
        long sum = Operations.getSum(numbers);
        BigInteger result = BigInteger.valueOf(sum);
        if (result.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 ||
                result.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
            assertThrows(ArithmeticException.class, () -> {
                throw new ArithmeticException("Сумма не вмещается в тип long");
            });
        } else {
            Assertions.assertEquals(0, sum);
        }
    }

    @Test
    void testMult() {
        List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
        long mult = Operations.getMult(numbers);
        BigInteger result = BigInteger.valueOf(mult);
        if (result.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 ||
                result.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
            assertThrows(ArithmeticException.class, () -> {
                throw new ArithmeticException("Произведение не вмещается в тип long");
            });
        } else {
            Assertions.assertEquals(290521, mult);
        }
    }
    @Test
    void testIsSeven() {
        List<Integer> sevenList = new ArrayList<>();
        for (int i = 0; i < 77; i++) {
            sevenList.add(7);
        }
        Assertions.assertEquals(7, Operations.getMax(sevenList));
        Assertions.assertEquals(7, Operations.getMin(sevenList));
    }

    @Timeout(value = 777, unit = TimeUnit.MILLISECONDS)
    @Test
    @Disabled
    void testFailing() throws InterruptedException {
        Thread.sleep(777);
    }
}
