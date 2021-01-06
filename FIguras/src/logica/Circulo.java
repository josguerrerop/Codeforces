package logica;

public class Circulo extends Figura {

	public Circulo(double valor1) {
		super(valor1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.valor1, 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.valor1;
	}

}
