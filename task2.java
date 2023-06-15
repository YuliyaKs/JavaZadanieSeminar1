import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        
        // *Пункты реализовать в разных методах

        int i = random_number();
        System.out.println("i = " + i);

        int n = max_bit(i);
        System.out.println("Номер старшего значащего бита числа i равен " + n);
        System.out.println();

        int[] m1 = massif_1(i, n);
        System.out.println("Длина массива m1 равна " + m1.length);
        System.out.println("Первый элемент массива равен " + m1[0] + " , последний элемент массива равен " + m1[m1.length-1]);
        System.out.println();

        int[] m2 = massif_2(i, n);
        System.out.println("Длина массива m2 равна " + m2.length);
        System.out.println("Первый элемент массива равен " + m2[0] + " , последний элемент массива равен " + m2[m2.length-1]);
    }

    // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int random_number(){
        return new Random().nextInt(0, 2000);
    }

    // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int max_bit(int number){
        return Integer.toBinaryString(number).length()-1;
    }

    //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static int[] massif_1(int i, int n) {
        int max = Short.MAX_VALUE;
        int[] m1 = new int[(max - ((i - 1) / n) * n) / n]; // создаем массив длиной равной количеству чисел, которые делятся на n
        // заполняем массив числами, кратными n
        for (int j = i, k = 0; j <= max; j++) {
            if (j % n == 0){
                m1[k] = j;
                k++;
            }
        }
        return m1;
    }

    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static int[] massif_2(int i, int n) {
        int min = Short.MIN_VALUE;
        int[] m2 = new int[(-1 * min + i) - (-1 * min / n + i / n)];
        // заполняем массив числами, некратными n
        for (int j = min, k = 0; j <= i; j++) {
            if (j % n != 0){
             m2[k] = j;
                k++;
            }
        }
        return m2;
    }
}
