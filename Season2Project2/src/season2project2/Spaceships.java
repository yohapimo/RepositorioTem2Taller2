package season2project2;

/**
 * Representa la clase abstracta en la cual creamos el método constructor y los
 * métodos de obtener y cambiar.
 *
 * @author Yon Hawer Piñeros
 */
public abstract class Spaceships {

    /**
     * Representa los atributos generales.
     */
    public String name;
    public int size;
    public int weight;
    public int cargo_weight;
    public int spaceships_thrust;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase.
     *
     * @param name
     * @param size
     * @param weight
     * @param cargo_weight
     * @param spaceships_thrust
     * @param capacity_people
     */
    public Spaceships(String name, int size, int weight, int cargo_weight, int spaceships_thrust, int capacity_people) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.cargo_weight = cargo_weight;
        this.spaceships_thrust = spaceships_thrust;
    }

    /**
     * Representa el acceso a los campos o atributos.
     *
     * @return La información del solicitada.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCargo_weight() {
        return cargo_weight;
    }

    public void setCargo_weight(int cargo_weight) {
        this.cargo_weight = cargo_weight;
    }

    public int getSpaceships_thrust() {
        return spaceships_thrust;
    }

    public void setSpaceships_thrust(int spaceships_thrust) {
        this.spaceships_thrust = spaceships_thrust;
    }

}
