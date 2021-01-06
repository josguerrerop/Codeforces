package logica;
public class Cuadrado extends Figura {
	private double valor2;

	public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	public Cuadrado(double valor1,double valor2) {
		super(valor1);
		this.valor2=valor2;
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.valor1,2);
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.valor1*4;
	}
}
