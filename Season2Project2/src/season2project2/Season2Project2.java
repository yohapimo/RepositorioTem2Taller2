package season2project2;

/**
 * Clase Main.
 *
 * Representa las instancias de las clases.
 *
 * @version 01.01.01 2022-04-10
 *
 * @author Yon Hawer Piñeros - yonhawer@hotmail.com
 *
 * @since Clase Main presente desde la versión 01
 */
public class Season2Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear instancias de las clases extends, no se instancia la clase
         * abstracta Spaceships.
         */
        ShuttleShip objShuttleShip = new ShuttleShip("Saturno V", 100, 2900, 118, 3500, 0);
        objShuttleShip.setFlightRange(100);
        objShuttleShip.createShuttleShip();

        System.out.println("\n");

        ShuttleShip objShuttleShip1 = new ShuttleShip("Energía", 60, 2400, 100, 3600, 0);
        objShuttleShip1.setFlightRange(100);
        objShuttleShip1.createShuttleShip1();

        System.out.println("\n");

        UnmannedShip objUnmannedShip = new UnmannedShip("Pionero XI", 0, 258, 0, 26, 0);
        objUnmannedShip.setFuel("");
        objUnmannedShip.createShuttleShip();

        System.out.println("\n");

        UnmannedShip objUnmannedShip2 = new UnmannedShip("Vikingo I", 0, 0, 0, 272, 0);
        objUnmannedShip2.setFuel("Nitrogen");
        objUnmannedShip2.createShuttleShip2();

        System.out.println("\n");

        MannedShip objMannedShip = new MannedShip("EEI", 0, 420, 0, 0, 00);
        objMannedShip.setCapacity_people(7);
        objMannedShip.createShuttleShip();

    }

}
