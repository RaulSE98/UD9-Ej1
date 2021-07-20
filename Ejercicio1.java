import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electrodomestico lista[] = new Electrodomestico[3];
		Lavadora lav[] = new Lavadora[3];
		Television tele[] = new Television[3];
		
		
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(200, "negro", 'A', 10.0);
		Electrodomestico e3 = new Electrodomestico(400, 12.0);
		
		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora(200, "gris", 'B', 20.0, 8.0);
		Lavadora l3 = new Lavadora(150, 20.0);
		
		Television t1 = new Television();
		Television t2 = new Television(20, false);
		Television t3 = new Television(500, 20.0);
		
		
		for (int i = 0; i < lista.length; i++) {
			lista[i].precioFinal(lista[i].getC_energetico(), lista[i].getPeso(), lista[i].getPrecio_base());
			lista[i].toString();
		}
		
		for (int i = 0; i < lav.length; i++) {
			lav[i].precioFinal(lav[i].getC_energetico(), lav[i].getPeso(), lav[i].getPrecio_base());
			lav[i].toString();
		}
		
		for (int i = 0; i < tele.length; i++) {
			tele[i].precioFinal(tele[i].getC_energetico(), tele[i].getPeso(), tele[i].getPrecio_base());
			tele[i].toString();
		}

	}

}
