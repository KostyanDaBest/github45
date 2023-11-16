import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random(); //1 вариант
        int[] arr = {1, 2, 3, 4, 5,7,8,9,10};  // 2 вариант
//        int[] arr = new int[10]; // мой 3 вариант ( не работает)
        int x = arr.length;
        for (int i = 0; i < x / 2; i++) {
            int y = arr[i];
            arr[i] = arr[x - i - 1];
            arr[x - i - 1] = y;
        }
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random. nextInt(10);// 1 вариант
            System.out.print(arr[i] + " ");
        }
    }
}


