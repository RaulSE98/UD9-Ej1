
public class Electrodomestico {
	int precio_base;
	String color;
	char c_energetico;
	double peso;

	public Electrodomestico() {
		this.precio_base = 100;
		this.color = "blanco";
		this.c_energetico = 'F';
		this.peso = 5.0;
	}
	public Electrodomestico(int precio_base, String color, char c_energetico, double peso) {
		super();
		this.precio_base = precio_base;
		this.color = color;
		this.c_energetico = c_energetico;
		this.peso = peso;
	}

	public Electrodomestico(int precio_base, double peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
	}
	
	public int getPrecio_base() {
		return precio_base;
	}
	public String getColor() {
		return color;
	}
	public char getC_energetico() {
		return c_energetico;
	}
	public double getPeso() {
		return peso;
	}
	
	
	private static void comprobarConsumoEnergetico(char c_energetico){
		if (c_energetico != 'A' || c_energetico != 'B' || c_energetico != 'C' || c_energetico != 'D' || c_energetico != 'E' || c_energetico != 'F') {
			c_energetico = 'F';
		}
	}
	
	private static void comprobarColor(String color) {
		if (!color.equals("blanco") || !color.equals("negro") || !color.equals("rojo") || !color.equals("azul") || !color.equals("gris")) {
			color = "blanco";
		}
	}
	
	public static void precioFinal(char ce, double peso, int precio_base){
		int pf = precio_base;
		if (ce == 'A') {
			pf = pf + 100;	
		}else if (ce == 'B') {
			pf = pf + 80;
		}else if (ce == 'C') {
			pf = pf + 60;
		}else if (ce == 'D') {
			pf = pf + 50;
		}else if (ce == 'E') {
			pf = pf + 30;
		}else {
			pf = pf + 10;
		}
		
		if (0.0 < peso && peso <= 19.0) {
			pf = pf + 10;
		}else if (20.0 <= peso && peso <= 49.0) {
			pf = pf + 50;
		}else if (50.0 <= peso && peso <= 79.0) {
			pf = pf + 80;
		}else {
			pf = pf + 100;
		}
		
		precio_base = pf;
	}
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio_base + ", color=" + color + ", c_energetico=" + c_energetico
				+ ", peso=" + peso + "]";
	}
	
	
}
