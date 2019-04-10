

// TODO: Auto-generated Javadoc
/**
 * La clase ProgramaComposicionCono representa el programa principal. Se trata
 * de un programa que genera 5 conos con atributos aleatorios que los muestra
 * por pantalla.
 * 
 * @author Jacinto
 * @version 1.0
 */
public class ProgramaComposicionCono {

	/**
	 * Metodo Main. Punto de entrada/arranque de la aplicacion.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}
	}
}
