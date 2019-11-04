package task03;

public class ArrayUtils {
    public static int[] shiftArray(int[] inputArray, int number) {
        int[] outputArray = inputArray.clone();

        if (number >= inputArray.length || number <= 0) {
            return outputArray;
        } else {
            for (int i = 0; i < inputArray.length; i++) {
                if (i + number < inputArray.length) {
                    outputArray[i + number] = inputArray[i];
                } else {
                    outputArray[i + number - inputArray.length] = inputArray[i];
                }
            }
            return outputArray;
        }
    }
}
