/**
 * Created by Maya Pogrebinsky on 2/25/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private SideOfCampus side;

    public enum SideOfCampus {WEST, EAST}


    public Person(String name, SideOfCampus side) {
        this.name = name;
        this.side = side;
    }

    public Person() {
        this("Default", SideOfCampus.WEST);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SideOfCampus getSide() {
        return side;
    }

    public void setSide(SideOfCampus side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return name + " lives on " + side + " of campus";
    }

    public int compareTo(Person p) {
        if (this.side == SideOfCampus.WEST && p.getSide() == SideOfCampus.EAST) {
            return -1;
        } else if (this.side == SideOfCampus.EAST && p.getSide() == SideOfCampus.WEST) {
            return 1;
        } else {
            return 0;
        }
    }


}
