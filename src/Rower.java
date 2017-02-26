/**
 * Created by Maya Pogrebinsky on 2/25/2017.
 */
public class Rower extends Person {

    public static int numberOfRowers;
    private RowingSide rowingSide;

    public enum RowingSide {STARBOARD, PORT, BOTH}

    public Rower() {
        this("Default", SideOfCampus.WEST, RowingSide.BOTH);
    }

    public Rower(String name, SideOfCampus campusSide, RowingSide rowingSide) {
        super(name, campusSide);
        this.rowingSide = rowingSide;
        numberOfRowers++;
    }

    @Override
    public String toString() {
        return super.toString() + " and is a rower";
    }
}
