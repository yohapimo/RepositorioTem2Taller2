package season2project2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa la que hereda los atributos de la clase abstracta y así poder
 * realizar la manipulación de los datos.
 *
 * @author Yon Hawer Piñeros
 */
public class UnmannedShip extends Spaceships {

    Scanner sc = new Scanner(System.in);

    /**
     * Representa los atributos propios de esta clase.
     */
    public String fuel;
    public ArrayList<String> place;

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
    public UnmannedShip(String name, int size, int weight, int cargo_weight, int spaceships_thrust, int capacity_people) {
        super(name, size, weight, cargo_weight, spaceships_thrust, capacity_people);
    }

    /**
     * Representa un método propio de esta clase.
     *
     * @return getFuel.
     */
    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    /**
     * Representa los métodos para la creación de las naves, también usamos el
     * atributo propio de esta clase y hay una sobre escritura de métodos.
     */
    public void createShuttleShip() {
        System.out.println("UNMANNED SHIP." + "\n" + "Name: " + getName() + "\nWeight: " + getWeight() + " Kilos" + "\nThrust: " + getSpaceships_thrust() + " Kilos");

    }

    public void createShuttleShip2() {
        System.out.println("UNMANNED SHIP." + "\n" + "Name: " + getName() + "\nThrust: " + getSpaceships_thrust() + " Kilos" + "\nFuel: " + getFuel());

        /**
         * Representa el ArrayList para determinar el lugar de la misión.
         */
        ArrayList<String> place = new ArrayList<String>();
        place.add("Saturn and its moons");
        place.add("Jupiter");
        place.add("Mars");
        place.add("Mercury");
        place.add("Pluto");
        place.add("Uranus and Neptune");
        place.add("Sun");
        place.add("Venus");

        System.out.println("Ingrese el numero de la mision:");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Select the location of the mission: " + place.get(numero));
    }

}
