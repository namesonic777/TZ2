import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileReader;

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
        Assertions.assertEquals(0, Operations.getSum(numbers));
    }

    @Test
    void testMult() {
        List<Integer> numbers = Arrays.asList(7, -7, 77, -77);
        Assertions.assertEquals(290521, Operations.getMult(numbers));
    }

    @Test
    void testTimeLilMin() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/10.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getMin(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время поиска минимума для файла с десятью числами: " + duration + " мс");
    }
    @Test
    void testTimeLilMax() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/10.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getMax(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время поиска максимума для файла с десятью числами: " + duration + " мс");
    }
    @Test
    void testTimeLilSum() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/10.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getSum(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления суммы всех чисел для файла с десятью числами: " + duration + " мс");
    }
    @Test
    void testTimeLilMult() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/10.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getMult(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления произведения всех чисел для файла с десятью числами: " + duration + " мс");
    }
    @Test
    void testTimeLargeMin() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/100000.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getMin(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время поиска минимума для файла со ста тысячами чисел: " + duration + " мс");
    }
    @Test
    void testTimeLargeMax() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/100000.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getMax(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время поиска максимума для файла со ста тысячами чисел: " + duration + " мс");
    }
    @Test
    void testTimeLargeSum() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/100000.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getSum(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления суммы всех чисел для файла со ста тысячами чисел: " + duration + " мс");
    }
    @Test
    void testTimeLargeMult() throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/100000.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                String[] stringArray = line.split(" ");
                for (String number : stringArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }
        }
        long T1 = System.nanoTime();

        Operations.getMult(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления произведения всех чисел для файла со ста тысячами чисел: " + duration + " мс");
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

    @Test
    @Disabled
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testFailing() throws InterruptedException {
        Thread.sleep(7777);
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44);
        Assertions.assertEquals(351384, Operations.getMult(numbers));
    }
}
