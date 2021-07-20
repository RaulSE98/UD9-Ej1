
public class Lavadora extends Electrodomestico{
	
	double carga;

	public Lavadora(int precio_base, double peso) {
		super(precio_base, peso);
		this.carga = 5.0;
	}

	public Lavadora() {
		super();
	}

	public Lavadora(int precio_base, String color, char c_energetico, double peso, double carga) {
		super(precio_base, color, c_energetico, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}
	
	public  void precioFinal2(){
		super.precioFinal(c_energetico, peso, precio_base);
		if(carga > 30.0) {
			precio_base = precio_base + 50;
		}
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precio=" + precio_base + ", color=" + color + ", c_energetico="
				+ c_energetico + ", peso=" + peso + "]";
	}
	
	

}
