public class Cycle {
    public static void main(String[] args) {
        System.out.println("Цикл for:");
        for (int i = 0; i <= 20; i++) {
            System.out.println("Число " + i);
        }
        System.out.println("");
        System.out.println("Цикл while:");
        int i = 6;
        while (i >= -6) {
            System.out.println("Число " + i);
            i = i - 2;
        }
        System.out.println("");
        System.out.println("Цикл do while:");
        int j = 10;
        int result = 0;
        do {
            if (j % 2 != 0) {
                result = result + j;
            }
            j++;
        } while (j <= 20);
        System.out.println("Сумма нечетных чисел от 10 до 20 равна " + result);
    }
}