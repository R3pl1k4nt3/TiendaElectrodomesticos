package electrodomesticos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main  {
	static Collection<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

	public static <T> double precioListaElectrodomesticos(Collection<T> listaGenerica) {
		double precioLista = 0;
		for (T electrodomestico : listaGenerica) {
			precioLista += ((Electrodomestico) electrodomestico).precioFinal();
		}
		return precioLista;
	}

	public static Collection<Electrodomestico> getListaElectrodomesticos() {
		return listaElectrodomesticos;
	}

	public static <T> void Presupuesto(Collection<T> listaGenerica) {
		String texto = "";
		String presupuesto = "";
		for (T electrodomestico : listaGenerica) {
			texto += "\n" + electrodomestico.toString();
		}

		presupuesto += "\n\n El presupuesto total asciende a : " + precioListaElectrodomesticos(listaGenerica) + " €";
		System.out.print(texto);
		System.err.println(presupuesto);
	}

	
	public static void main(String[] args) {
		Electrodomestico electrodomestico1 = new Electrodomestico(200, 60);
		Electrodomestico electrodomestico2 = new Electrodomestico("Azul", 100, 'H', 12);
		Electrodomestico electrodomestico3 = new Electrodomestico();
		Electrodomestico electrodomestico4 = new Electrodomestico("Gris", 450, 'A', 90);
		Electrodomestico lavadora1 = new Lavadora("Blanco", 350, 'B', 80, 31);
		Electrodomestico television1 = new Television(500, 50);
		Electrodomestico television2 = new Television("Negro", 500, 'A', 80, 65, true);

		listaElectrodomesticos.add(electrodomestico1);
		listaElectrodomesticos.add(electrodomestico2);
		listaElectrodomesticos.add(electrodomestico3);
		listaElectrodomesticos.add(electrodomestico4);
		listaElectrodomesticos.add(lavadora1);
		listaElectrodomesticos.add(television1);
		listaElectrodomesticos.add(television2);
		
		((ArrayList<Electrodomestico>) listaElectrodomesticos).sort(new Comparator<Electrodomestico>() {
            @Override
            public int compare(Electrodomestico p1, Electrodomestico p2) {
                return Double.compare(p1.precioFinal(), p2.precioFinal());
            }
        });

//		listaElectrodomesticos.forEach(System.out::println);
//		System.out.println(lavadora1.precioFinal());
		Presupuesto(listaElectrodomesticos);
		
	}

	

}
