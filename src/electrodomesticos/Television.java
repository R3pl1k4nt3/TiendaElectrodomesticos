package electrodomesticos;

public class Television extends Electrodomestico implements Comerciable {
	boolean TDT;
	int pulgadas;
	static int PULGADASDEFECTO = 20;
	public boolean isTDT() {
		return TDT;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public Television(String color, double precio, char consumoEnergetico, double peso, int pulgadas, boolean tDT) {
		super(color, precio, consumoEnergetico, peso);
		this.pulgadas = pulgadas;
		TDT = tDT;
	}
	
	public Television(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		pulgadas = PULGADASDEFECTO;
		TDT = false;
		consumoEnergetico = CONSUMOENERGETICO;
		color = COLOR;
	}
	
	public Double precioFinal() {
		double precioFinalTV = 0;
		if (TDT == true) {
			precioFinalTV += 50;
		}
		return precioFinalTV + super.precioFinal();
	}
	
	@Override
	public String toString() {
		return "Television = " + getColor() + " - " + getPrecio() + "€ - consumo energetico = " + getConsumoEnergetico() + " - " + getPeso() + "kg\n - pulgadas = " + getPulgadas() + " - TDT = " + isTDT() + ". PRECIO FINAL = " + precioFinal();
	}
	
}
