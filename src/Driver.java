/**
 * Created by Maya Pogrebinsky on 2/25/2017.
 */
public class Driver extends Person {

    private int seatsInCar;

    public Driver(int seatsInCar) {
        super();
        this.seatsInCar = seatsInCar;
    }

    public Driver() {
        this(5);
    }

    public int getSeatsInCar() {
        return seatsInCar;
    }
    public void setSeatsInCar(int seatsInCar) {
        this.seatsInCar = seatsInCar;
    }
}
