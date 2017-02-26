import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Maya Pogrebinsky on 2/25/2017.
 */
public class RideSorter {

    public static List<Person> peopleComingToPractice = new LinkedList<>();
    //public Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Rower maya = new Rower("Maya", Person.SideOfCampus.WEST, Rower.RowingSide.STARBOARD);
        Rower itzel = new Rower("Itzel", Person.SideOfCampus.EAST, Rower.RowingSide.PORT);
        Rower lesley = new Rower("Lesley", Person.SideOfCampus.WEST, Rower.RowingSide.PORT);
        Rower hannah = new Rower("Hannah", Person.SideOfCampus.WEST, Rower.RowingSide.STARBOARD);

        peopleComingToPractice.add(maya);
        peopleComingToPractice.add(itzel);
        peopleComingToPractice.add(lesley);
        peopleComingToPractice.add(hannah);

        for (Person p : peopleComingToPractice) {
            System.out.println(p);
        }

        Collections.sort(peopleComingToPractice);
        for (Person p : peopleComingToPractice) {
            System.out.println(p);
        }


    }
}
