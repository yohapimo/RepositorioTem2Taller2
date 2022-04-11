package season2project2;

/**
 * Representa la que hereda los atributos de la clase abstracta y así poder
 * realizar la manipulación de los datos.
 *
 * @author Yon Hawer Piñeros
 */
public class ShuttleShip extends Spaceships {

    /**
     * Atributo propio de esta clase.
     */
    public int flightRange;

    /**
     * Representa el constructor y es necesario llamarlo de la clase abstracta
     * utilizando la palabra super ().
     *
     * @param name
     * @param size
     * @param weight
     * @param cargo_weight
     * @param spaceships_thrust
     * @param capacity_people
     */
    public ShuttleShip(String name, int size, int weight, int cargo_weight, int spaceships_thrust, int capacity_people) {
        super(name, size, weight, cargo_weight, spaceships_thrust, capacity_people);
    }

    /**
     * Representa un método propio de esta clase.
     *
     * @return FlightRange().
     */
    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    /**
     * Representa los métodos para la creación de las naves, también usamos el
     * atributo propio de esta clase y hay una sobre escritura de métodos.
     */
    public void createShuttleShip() {
        System.out.println("SHUTTLE SHIP." + "\n" + "Name: " + getName() + "\nSize: "
                + getSize() + " Meters" + "\nWeight: " + getWeight() + " Tons" + "\nCarge: "
                + getCargo_weight() + " Tons" + "\nThrust: " + getSpaceships_thrust() + " Tons");

    }

    public void createShuttleShip1() {
        System.out.println("SHUTTLE SHIP." + "\n" + "Name: " + getName() + "\nSize: "
                + getSize() + " Meters" + "\nWeight: " + getWeight() + " Tons" + "\nCarge: "
                + getCargo_weight() + " Tons" + "\nThrust: " + getSpaceships_thrust() + " Tons");

    }

}
