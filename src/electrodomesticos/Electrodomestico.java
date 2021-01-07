package electrodomesticos;

public class Electrodomestico implements Comerciable {
	String color;
	double precio;
	char consumoEnergetico;
	double peso;
	static final String COLOR = "Blanco";
	static final char CONSUMOENERGETICO = 'F';

	public String getColor() {
		return color;
	}

	public double getPrecio() {
		return precio;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public Electrodomestico(String color, double precio, char consumoEnergetico, double peso) {
		super();
		this.color = comprobarColor(color);
		this.precio = precio;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public Electrodomestico() { // por defecto
		color = COLOR;
		consumoEnergetico = CONSUMOENERGETICO;
		precio = 100;
		peso = 5;
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		color = COLOR;
		consumoEnergetico = CONSUMOENERGETICO;
	}

	public char comprobarConsumoEnergetico(char consumoEnergetico) {
		char consumo = 'F';
		if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D'
				|| consumoEnergetico == 'E') {
			consumo = consumoEnergetico;
		}
		return consumo;
	}

	public String comprobarColor(String color) {
		String comprobarColor = "Blanco";
		if (color == "Gris" || color == "Negro" || color == "Rojo") {
			comprobarColor = color;
		}
		return comprobarColor;
	}

	public Double precioFinal() {
		double precioFinal = getPrecio();
		if (consumoEnergetico == 'A') {
			precioFinal += 100;
		} else if (consumoEnergetico == 'B') {
			precioFinal += 80;
		} else if (consumoEnergetico == 'C') {
			precioFinal += 60;
		} else if (consumoEnergetico == 'D') {
			precioFinal += 50;
		} else if (consumoEnergetico == 'E') {
			precioFinal += 30;
		} else {
			precioFinal += 10;
		}
		if (peso <= 19) {
			precioFinal += 10;
		} else if (peso <= 49) {
			precioFinal += 50;
		} else if (peso <= 79) {
			precioFinal += 80;
		} else {
			precioFinal += 100;
		}

		return precioFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico = " + getColor() + " - " + getPrecio() + "€ - consumo energetico = "
				+ getConsumoEnergetico() + " - " + getPeso() + "kg\n. PRECIO FINAL = " + precioFinal();
	}

	@Override
	public int compare(Electrodomestico arg0, Electrodomestico arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	
}
