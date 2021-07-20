
public class Television extends Electrodomestico{
	int resolucion;
	boolean tdt;
	
	public Television(int resolucion, boolean tdt) {
		super();
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	public Television() {
		super();
		this.resolucion = 20;
		this.tdt = false;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public Television(int precio_base, double peso) {
		super(precio_base, peso);
		// TODO Auto-generated constructor stub
	}
	
	public  void precioFinal2(){
		super.precioFinal(c_energetico, peso, precio_base);
		if(resolucion > 40) {
			precio_base = precio_base + (int) (precio_base*0.3);
		}
		
		if (tdt) {
			precio_base = precio_base  + 50;
		}
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", tdt=" + tdt + ", precio=" + precio_base + ", color="
				+ color + ", c_energetico=" + c_energetico + ", peso=" + peso + "]";
	}
	
	

}
