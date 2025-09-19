
import java.util.Scanner;

public class juan {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        String mensaje;

    System.out.println("Bienvenido");
    System.out.print("Mensaje: ");
    mensaje = lector.nextLine();
    System.out.println(mensaje.toUpperCase());
  }
}
