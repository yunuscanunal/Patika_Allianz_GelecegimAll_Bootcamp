public class RepeatingEvenNumbers {

    static boolean isFound(int[] ar, int num) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 5, 5, 7, 8, 9, 11, 55, 55, 65, 915, 54, 3, 2, 4, 4, 4, 2, 6, 6, 6, 66, 66};
        int[] temp = new int[array.length];
        int startIn = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isFound(temp, array[i])) {
                    if (i != j && array[i] == array[j]) {
                        temp[startIn] = array[i];
                        startIn++;
                    }
                }
            }
        }
        for (int row : temp) {
            if (row != 0 && row % 2 == 0) {
                System.out.println(row);
            }
        }
    }
}