import java.util.Random;

public class task1 {
    public static void main(String[] args) {

        // Пункты реализовать в методе main

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(0, 2000);
        System.out.println("i = " + i);


        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("Номер старшего значащего бита числа i равен " + n);
        System.out.println();


        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int max = Short.MAX_VALUE;
        int[] m1 = new int[(max - ((i - 1) / n) * n) / n]; // создаем массив длиной равной количеству чисел, которые делятся на n
        System.out.println("Длина массива m1 равна " + m1.length);

        // заполняем массив числами, кратными n
        for (int j = i, k = 0; j <= max; j++) {
            if (j % n == 0){
                m1[k] = j;
                k++;
            }
        }
        System.out.println("Первый элемент массива равен " + m1[0] + " , последний элемент массива равен " + m1[m1.length-1]);
        System.out.println();


        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int min = Short.MIN_VALUE;
        int[] m2 = new int[(-1 * min + i) - (-1 * min / n + i / n)];
        System.out.println("Длина массива m2 равна " + m2.length);
        
        // заполняем массив числами, некратными n
        for (int j = min, k = 0; j <= i; j++) {
            if (j % n != 0){
                m2[k] = j;
                k++;
            }
        }
        System.out.println("Первый элемент массива равен " + m2[0] + " , последний элемент массива равен " + m2[m2.length-1]);
    }
}
