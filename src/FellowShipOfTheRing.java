import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FellowShipOfTheRing {
    public static void main(String[] args) {
       // TODO
        Set<String> dwarves = new HashSet<>(List.of("Gimli"));


        Set<String> elves = new HashSet<>(List.of("Legolas"));


        Set<String> humans = new HashSet<>(List.of("Aragorn","Boromir"));


        Set<String> hobbits = new HashSet<>(List.of("Frodo","Sam","Merry","Pippin"));

        Set<String> fellowship = new HashSet<>();
        fellowship.addAll(dwarves);
        fellowship.addAll(humans);
        fellowship.addAll(elves);
        fellowship.addAll(hobbits);
        fellowship.add("Gandalf");

        System.out.println(fellowship);
        fellowship.remove("Gandalf");
        fellowship.add("Gandalf the White");
        fellowship.removeAll(hobbits);
        System.out.println(fellowship.containsAll(hobbits));
        System.out.println(fellowship);
        System.out.println();
//        humans.remove("Boromir");
        fellowship.remove("Boromir");
        System.out.println(fellowship);




    }
}
