import java.util.ArrayList;
import java.util.Scanner;

public class SortingInArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int i = 0, lengthOfArray = input.nextInt();

        ArrayList<Integer> sortList = new ArrayList<Integer>();
        while (i < lengthOfArray) {
            System.out.print("Enter the Items for Array: ");
            int element = input.nextInt();
            sortList.add(element);
            i++;
        }
        for (int j = 0; j < lengthOfArray; j++) {
            // Inner nested loop pointing 1 index ahead
            for (int k = j + 1; k < lengthOfArray; k++) {
                // Checking elements
                int temp = 0;
                int temp2 = 0;
                if (sortList.get(k) < sortList.get(j)) {
                    // Swapping
                    temp = sortList.get(j);
                    temp2 = sortList.get(k);
                    sortList.set(j, temp2);
                    sortList.set(k, temp);
                }
            }
            // Printing sorted array elements
            System.out.print(sortList.get(j) + " ");
        }

    }
}