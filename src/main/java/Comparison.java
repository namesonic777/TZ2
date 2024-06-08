import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Comparison {
    private static List<Integer> numbersList = new ArrayList<>();

    public static void main(String[] args) {

        String[] tests = {"src/10.txt", "src/100000.txt"};

        for (int i = tests.length - 1; i >= 0; i--) {
            try (BufferedReader reader = new BufferedReader(new FileReader(tests[i]))) {
                String[] stringNumbersArray = reader.readLine().split(" ");
                numbersList.clear();
                for (String numStr : stringNumbersArray) {
                    numbersList.add(Integer.parseInt(numStr));
                }
                testMinTime();
                testMaxTime();
                testSumTime();
                testMultTime();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void testMinTime() {
        long T1 = System.nanoTime();

        Operations.getMin(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления минимума из всех чисел в файле: " + duration + " мс");
    }

    public static void testMaxTime() {
        long T1 = System.nanoTime();

        Operations.getMax(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления максимума из всех чисел в файле: " + duration + " мс");
    }

    public static void testSumTime() {
        long T1 = System.nanoTime();

        Operations.getSum(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления суммы всех чисел в файле: " + duration + " мс");
    }

    public static void testMultTime() {
        long T1 = System.nanoTime();

        Operations.getMult(numbersList);

        long T2 = System.nanoTime();
        long duration = (T2 - T1) / 1_000_000;

        System.out.println("Время вычисления произведения всех чисел в файле: " + duration + " мс");
    }
}
