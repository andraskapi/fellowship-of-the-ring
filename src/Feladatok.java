import java.util.*;

public class Feladatok {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 7, 2, 3, 4, 10, 8, 9, 11, 5, 4, 3, 6, 5, 6, 5, 1, 8, 10, 9, 15};
        Set<Integer> listOfNumbers = new HashSet<>();
        for (int num : numbers) {
            listOfNumbers.add(num);
        }
        System.out.println(listOfNumbers);
        listOfNumbers.size();
        System.out.println(listOfNumbers.size());


        Set<Integer> evenNumbers = new HashSet<>();
        Set<Integer> oddNumbers = new HashSet<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
        System.out.println("even qty: " + evenNumbers.size() + " odd qty: " + oddNumbers.size());

        Random ran = new Random();

        List<Integer> diceThrow = new ArrayList<>();

        Map<Integer, Integer> countDice = new HashMap<>();

        double sum = 0;
        int count = 0;


        for (int i = 0; i < 1000; i++) {
            int dice = ran.nextInt(1, 7);
            diceThrow.add(dice);
            sum += dice;

        }
        System.out.println(diceThrow.size());
        double avg;
        avg = sum / diceThrow.size();
        System.out.println(avg);
        int countTwo = 0;

        for (int i = 0; i < diceThrow.size(); i++) {
            if (diceThrow.contains(1)){
                countTwo++;
            }

        }
        int countOne = countDthr(diceThrow,1);
        System.out.println(countOne);





    }

    public static int countDthr(List<Integer> diceThrow, int number){
        int count = 0;
        for (int num : diceThrow){
            if(num == number){
                count++;
            }
        }
        return count;
    }



}
