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
        int index = 0;
        for (int salary : inputArray2) {
            outputArray2[index] = salary * 0.13;
            index++;
        }
        System.out.println("inputArray2:" + Arrays.toString(inputArray2));
        System.out.println("outputArray2 (налог 13%): " + Arrays.toString(outputArray2));
        System.out.println();
        //Задача №3
        System.out.println("Задача №3");
        int[] innputArray3 = {3000, 6000, 4000, 7000, 5000};
        boolean[] outputArray3 = new boolean[innputArray3.length];
        int index3 = 0;
        for (int bonus : innputArray3) {
            if (bonus >5000){
                outputArray3[index3] = true;
            } else {
                outputArray3[index3] = false;
            }
            index3++;
        }
        System.out.println("inputArray3:" + Arrays.toString(innputArray3));
        System.out.println("outputArray3 (бонус > 5000):" + Arrays.toString(outputArray3));
        System.out.println();
        //Задание №4
        System.out.println("Задание №4");
        int[] inpputArray4 = {100, -50, 200, 300, 400};
        boolean[] outputArray4 = new boolean[1];
        outputArray4[0] = true;
        for (int balance : inpputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println("inputArray4:" + Arrays.toString(inpputArray4));
        System.out.println("outputArray4 (нет отрицательных остатков):" + Arrays.toString(outputArray4));
        System.out.println();
        //Задание №5
        System.out.println("Задание №5");
        int[] inputArray5 = {-100, 200, -50, 300, 0};
        int[] outputArray5 = new int[1];
        outputArray5[0] = 0;
        for (int profit : inputArray5) {
            if (profit > 0)
                outputArray5[0]++;
        }
        System.out.println("inputArray5:" + Arrays.toString(inputArray5));
        System.out.println("outputArray5 (количество рентабельных месяцев):" + Arrays.toString(outputArray5));
        System.out.println("end");
    }
}