import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class OperationsTests {

        @Test
        void testMin() {
            List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
            assertEquals(-77, Operations.getMin(numbers));
        }
        @Test
        void testMax() {
            List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
            assertEquals(77, Operations.getMax(numbers));
        }
        @Test
        void testSum() {
            List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
            assertEquals(0, Operations.getSum(numbers));
        }
        @Test
        void testMult() {
            List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
            assertEquals(290521, Operations.getMult(numbers));
        }
        @Test
        void testTime() {
            List<Integer> largeList = new ArrayList<>();
            for (int i = 0; i < 5000000; i++) {
                largeList.add(i);
            }
            long T1 = System.currentTimeMillis();

            Operations.getMin(largeList);
            Operations.getMax(largeList);
            Operations.getSum(largeList);
            Operations.getMult(largeList);

            long T2 = System.currentTimeMillis();
            long duration = T2 - T1;

            System.out.println("Время выполнения: " + duration + " мс");
        }
        @Test
        void testIsSeven(){
            List<Integer> sevenList = new ArrayList<>();
            for (int i = 0; i < 77; i++) {
                sevenList.add(7);
            }
            assertEquals(7, Operations.getMax(sevenList));
            assertEquals(7, Operations.getMin(sevenList));
        }
        @Test
        @Timeout(value = 7777, unit = TimeUnit.SECONDS)
        void testFailing() throws InterruptedException {
            Thread.sleep(7777);
//            List<Integer> numbers = Arrays.asList(11,22,33,44);
//            assertEquals(351384, Operations.getMult(numbers));
        }
}
