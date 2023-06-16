import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MetodusokFeladatHarom {
    public static void main(String[] args) {

        Random ran = new Random();
        int sum = 0;

        List<Integer> diceThrow = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int dice = ran.nextInt(1, 7);
            diceThrow.add(dice);
            sum += dice;
        }
        System.out.println("size: " + diceThrow.size());
        System.out.println("AVG: " + (double) sum / diceThrow.size());
        printDiceThrowCount(diceThrowCount(diceThrow));


    }

    public static int[] diceThrowCount(List<Integer> diceThrow) {
        int[] count = new int[6];

        for (int num : diceThrow) {
            count[num - 1]++;
        }
        return count;
    }

    public static void printDiceThrowCount(int[] dctrwhCount) {
        for (int i = 0; i < 6; i++) {
            int count = dctrwhCount[i];
            System.out.println((i + 1) + " -> " + count + " db dobás");

        }
    }


}
