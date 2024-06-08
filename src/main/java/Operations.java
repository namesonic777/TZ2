import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Operations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sonya.txt"));
        ArrayList<Integer> numberList = new ArrayList<>();
        String[] stringNumberList = reader.readLine().split(" ");

        for (int i = 0; i < stringNumberList.length; i++) {
            numberList.add(Integer.parseInt(stringNumberList[i]));

            }
        int minimum = getMin(numberList);
        int maximum = getMax(numberList);
        long sum = getSum(numberList);
        long multiply = getMult(numberList);

        System.out.println("Минимальное: " + minimum);
        System.out.println("Максимальное: " + maximum);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + multiply);
    }
    public static int getMin(List<Integer> numberList) {
        int min = Integer.MAX_VALUE;
        for (int number : numberList) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    public static int getMax(List<Integer> numberList) {
        int max = Integer.MIN_VALUE;
        for (int number : numberList) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static long getSum(List<Integer> numberList) {
        long sum = 0;
        for (int number : numberList) {
            sum += number;
        }
        return sum;
    }
    public static long getMult(List<Integer> numberList) {
        long mult = 1;
        for (int number : numberList) {
            mult *= number;
        }
        return mult;
    }
}
