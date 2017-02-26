/**
 * Created by Maya Pogrebinsky on 2/25/2017.
 */
public class Coxswain extends Person {

    public static int numberOfCoxswains;

    public Coxswain(String name, SideOfCampus side) {
        super(name, side);
        numberOfCoxswains++;
    }

    public Coxswain() {
        this("Default", SideOfCampus.WEST);
    }

    @Override
    public String toString() {
        return super.toString() + " and is a coxswain";
    }
}
