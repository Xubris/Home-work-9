import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Здание№1
        System.out.println("Задание №1");
        int[] inputArray1 = {1000, 2000, 3000, 4000, 5000};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int value : inputArray1) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }
        double average = (double) sum / inputArray1.length;
        double[] outputArray1 = {sum, max, min, average};
        System.out.println("inputArray1:" + Arrays.toString(inputArray1));
        System.out.println("outputArray1 (сумма, макс, мин, среднее) " + Arrays.toString(outputArray1));
        System.out.println();
        //Задание №2
        System.out.println("Задание №2");
        int[] inputArray2 = { 10000, 20000, 30000, 40000, 50000};
        double[] outputArray2 = new double[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] =inputArray2[i] * 0.13;
        }
        System.out.println("inputArray2:" + Arrays.toString(inputArray2));
        System.out.println("outputArray2 (налог 13%) " + Arrays.toString(outputArray2));
        System.out.println();
        //Задача №3
        System.out.println("Задача №3");
        int[] innputArray3 = {3000, 6000, 4000, 7000, 5000};
        boolean[] outputArray3 = new boolean[innputArray3.length];
        for (int i = 0; i < innputArray3.length; i++) {
            outputArray3[i] = innputArray3[i] > 5000;
        }
        System.out.println("inputArray3:" + Arrays.toString(innputArray3));
        System.out.println("outputArray3:" + Arrays.toString(outputArray3));
        System.out.println();
        //Задание №4
        System.out.println("Задание №4");
        int[] inpputArray4 = {100, -50, 200, 300, 400};
        boolean outputArray4 = true;
        for (int balance : inpputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println("inputArray4:" + Arrays.toString(inpputArray4));
        System.out.println("outputArray4 (нет отрицательных остатков):" + outputArray4);
        System.out.println();
        //Задание №5
        System.out.println("Задание №5");
        int[] inputArray5 = {-100, 200, -50, 300, 0};
        int outputArray5 = 0;
        for (int profit : inputArray5) {
            if (profit > 0)
                outputArray5++;
        }
        System.out.println("inputArray5:" + Arrays.toString(inputArray5));
        System.out.println("outputArray5 (количество рентабельных месяцев):" + outputArray5);
        System.out.println("end");
    }
}