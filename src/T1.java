public class T1 {
    public static boolean check_order(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check_order(new int[]{0, 1, 2, 3, 5, 4, 5}));    // лень создавать алгоритм создания массива
    }
}
