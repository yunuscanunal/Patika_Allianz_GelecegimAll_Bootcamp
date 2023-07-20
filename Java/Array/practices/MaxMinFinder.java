import java.util.ArrayList;

public class MaxMinFinder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(56);
        list.add(34);
        list.add(1);
        list.add(8);
        list.add(101);
        list.add(-2);
        list.add(-33);

        int min = list.get(0);
        int max = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        list.remove(Integer.valueOf(min));
        list.remove(Integer.valueOf(max));

        int min2 = list.get(0);
        int max2 = list.get(0);
        for (int i : list) {
            if (i < min2) {
                min2 = i;
            }
            if (i > max2) {
                max2 = i;
            }
        }

        System.out.println("2. Minimum Değer " + min2);
        System.out.println("2. Maximum Değer " + max2);

    }
}
