public class T2 {
    public static boolean isPalindrome(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(new int[]{0, 1, 2, 1, 0}));
    }
}
