

/**
 * Clase que representa el objeto Cono.
 * 
 * @author Jacinto
 */
public class Cono {
	/**
	 * Atributos del objeto cono
	 * 
	 * @param base   la base del cono
	 * @param altura la altura del cono
	 * @param color  el color del cono
	 */
	private Circulo base;
	private float altura;
	private String color;

	/**
	 * Constructor para inicializar la base, la altura y el color del cono
	 * 
	 * @param base   base del cono
	 * @param altura altura del cono
	 * @param color  color del cono
	 */
	public Cono(float cX, float cY, float r, float h, String color) {
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}

	/**
	 * Get y Set para cada atributo.
	 *
	 * @return devuelve los tres atributos ya establecidos
	 */
	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Imprimir. Muestra la altura y el color del cono.
	 */
	public void imprimir() {
		base.imprimir();
		System.out.println(" h=" + altura + " c=" + color);
	}
}
