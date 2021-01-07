package electrodomesticos;

public class Lavadora extends Electrodomestico implements Comerciable{
	double carga;

	public Lavadora(String color, double precio, char consumoEnergetico, double peso, double carga) {
		super(color, precio, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	public Lavadora() {
		super();
		carga = 5;
	}

	public double getCarga() {
		return carga;
	}
	
	public Lavadora(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		carga = 5;
		
	}
	@Override
	public Double precioFinal() {
		double preciofinalLavadora = 0;
		if (carga >= 30) {
			preciofinalLavadora += 50;
		}
		return preciofinalLavadora + super.precioFinal();
	}

	@Override
	public String toString() {
		return "Lavadora = " + getColor() + " - " + getPrecio() + "€ - consumo energetico = " + getConsumoEnergetico() + " - " + getPeso() + "kg\n - carga = " + getCarga() + "kg. PRECIO FINAL = " + precioFinal();
	}
	
	
}
