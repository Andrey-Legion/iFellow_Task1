import java.lang.Math;
import java.util.Arrays;

/* Task 1-Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
  Для генерации случайного числа использовать метод Math.random(), который возвращает значение
  в промежутке [0, 1].*/
public class Main {
    public static void main(String[] args)
    {
        double[] array = generateArray(4);
        System.out.print("Массив: ");
        printArray(array);
        System.out.println();
        System.out.println("Максимальное значение: " + findingMax(array));
        System.out.println("Минимальное значение: " + findingMin(array));
        System.out.println("Среднее значение: " + (findingMax(array) + findingMin(array)) / 2);
        System.out.println("Среднее арифметическое: " + findingAverageArithmetic(array));

    }
    public static double[] generateArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static double findingMax (double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static double findingMin (double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static double findingAverageArithmetic (double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum +array[i];
        }
        return sum/array.length;
    }


}
