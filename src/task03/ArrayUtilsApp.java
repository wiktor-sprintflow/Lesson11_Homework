package task03;

import java.util.Arrays;

public class ArrayUtilsApp {
    public static void main(String[] args) {
        int[] table1 = {1,2,3,4,5};
        int[] table2 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(ArrayUtils.shiftArray(table1,2)));
        System.out.println(Arrays.toString(ArrayUtils.shiftArray(table1,-2)));

        System.out.println(Arrays.toString(ArrayUtils.shiftArray(table2,7)));
        System.out.println(Arrays.toString(ArrayUtils.shiftArray(table2,11)));
    }
}
