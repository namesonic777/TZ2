import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("sonya.txt");
        Scanner fileScanner = new Scanner(inputFile);
        List<Integer> numberList = new ArrayList<>();

        if (fileScanner.hasNextLine()) {
            String[] stringNumbers = fileScanner.nextLine().split(" ");
            for (String stringNumber : stringNumbers) {
                numberList.add(Integer.parseInt(stringNumber));
            }
        }
        int minimum = getMin(numberList);
        int maximum = getMax(numberList);
        long sum = getSum(numberList);
        long multiply = getMult(numberList);

        System.out.println("Минимальное: " + minimum);
        System.out.println("Максимальное: " + maximum);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + multiply);
        fileScanner.close();
    }
    public static int getMin(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    public static int getMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static long getSum(List<Integer> numbers) {
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static long getMult(List<Integer> numbers) {
        long mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
