
/**
 * Clase que representa el objeto Circulo.
 * @author Jacinto
 * */
public class Circulo {
	/**
	 * Atributos del objeto circulo
	 * @param x 
	 * @param y
	 * @param radio radio del circulo
	 * */
	private float x, y;
	private float radio;

	/**
	 * Constructor para inicializar los atributos del cono
	 * 
	 * @param cX parametro 1
	 * @param cY parametro 2
	 * @param r radio del circulo
	 */
	public Circulo(float cX, float cY, float r) {
		this.x = cX;
		this.y = cY;
		this.radio = r;
	}

	/**
	 * Get y Set para cada atributo.
	 *
	 * @return devuelve los tres atributos ya establecidos
	 */
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	/**
	 * Area. Calcula el area del circulo
	 * @return calculo del area
	 * */
	public float area() {
		return (float) Math.PI * radio * radio;
	}

	/**
	 * Imprimir. Muestra por pantalla en rojo cada atributo, así como
	 * el area calculada.
	 * */
	public void imprimir() {
		System.err.print(" x=" + x);
		System.err.print(" y=" + y);
		System.err.print(" r=" + radio);
		System.err.print(" A=" + area());
	}
}
