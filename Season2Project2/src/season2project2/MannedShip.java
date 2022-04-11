package season2project2;

import java.util.ArrayList;

/**
 * Representa la que hereda los atributos de la clase abstracta y así poder
 * realizar la manipulación de los datos.
 *
 * @author Yon Hawer Piñeros
 */
public class MannedShip extends Spaceships {

    /**
     * Representa los atributos propios de esta clase.
     */
    public int capacity_people;
    public ArrayList<String> people;

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
    public MannedShip(String name, int size, int weight, int cargo_weight, int spaceships_thrust, int capacity_people) {
        super(name, size, weight, cargo_weight, spaceships_thrust, capacity_people);
    }

    /**
     * Representa un método propio de esta clase.
     *
     * @return Capacity_people.
     */
    public int getCapacity_people() {
        return capacity_people;
    }

    public void setCapacity_people(int capacity_people) {
        this.capacity_people = capacity_people;
    }

    /**
     * Representa los métodos para la creación de las naves, también usamos el
     * atributo propio de esta clase y hay una sobre escritura de métodos.
     */
    public void createShuttleShip() {
        System.out.println("MANNED SHIP." + "\n" + "Name: " + getName() + "\nWeight: " + getWeight() + " Tons"
                + "\nCapacity: " + getCapacity_people() + " People");

        /**
         * Representa el ArrayList para determinar el número de tripulantes para
         * cada misión.
         */
        ArrayList<String> people = new ArrayList<String>();
        people.add("1 Person");
        people.add("2 Persons");
        people.add("3 Persons");
        people.add("4 Persons");
        people.add("5 Persons");
        people.add("6 Persons");
        people.add("7 Persons");

        System.out.println("We select the number of people: " + people.get(3));
    }

}
