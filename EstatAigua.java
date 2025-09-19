import java.util.Scanner;

/**
 *
 * @author Àlex Hernánddez
 */
public class EstatAigua {

    public static void main(String[] args) {

        //Configuració
        final int TEMP_FUSIO = 0, TEMP_EVAP = 100;
        final String MATERIAL = "l'aigua";

        //Variables
        int temp;
        Scanner teclat = new Scanner(System.in);

        //Codi
        System.out.printf("Introdueix la temperatura (enter): ");
        temp = teclat.nextInt();

        System.out.printf("L'estat de %s a %dºC és ",MATERIAL,temp);

        if (temp < TEMP_FUSIO) {
            System.out.printf("sòlid\n");
        }
        else if (temp < TEMP_EVAP) {
            System.out.printf("líquid\n");
        }
        else {
            System.out.printf("gas\n");
        }
    }

}
