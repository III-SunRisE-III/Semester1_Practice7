public class T3 {
    public static int[] count(int[] arr) {
        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int elem: arr) {
                if (arr[i] == elem) {
                    counts[i]++;
                }
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 4, 1};
        int[] counted = count(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент " + array[i] + " повторяется " + counted[i] + " раз.");
        }
    }
}

