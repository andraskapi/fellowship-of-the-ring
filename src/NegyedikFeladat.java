import java.util.Arrays;

public class NegyedikFeladat {
    public static void main(String[] args) {
        int[] numbers = {34808, 422, 334, 12014, 412617, 292389, 342260,
                32244, 334534, 497721, 3775, 544, 433, 55340, 257952, 1496173,
                73, 539141, 3355, 305720, 3677429, 114047, 5656};

        System.out.println(numbers.length);
        System.out.println(isItDuplicated(numbers));

        System.out.println(Arrays.toString(countLength(numbers)));
        int[] countLengths = countLength(numbers);
        printcountLength(countLength(numbers), numbers);
    }

    public static boolean isItDuplicated(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] countLength(int[] numbers) {


        int[] count = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] > 0) {
                numbers[i] /= 10;
                count[i]++;
            }

        }
        return count;
    }

    public static void printcountLength(int[] countLength, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {


            System.out.println("A tömb " + (i + 1) + ". eleme  a(z) " + numbers[i] + "" + countLength[i] + " számjegyből áll.");

        }


    }
}




