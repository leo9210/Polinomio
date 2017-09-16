
public class Polinomio {
	private int grado;
	private double [] coeficientes;
	public Polinomio() {
		
	}
	public Polinomio(int l_grado,double[] l_coeficientes) {
		this.grado = l_grado;
		this.coeficientes = l_coeficientes;
	}
	double evaluarMSucesivas(double x) {
		double resultado = 1;
		for(int i = 0;i<this.grado-1;i++) {
			resultado += ((x*this.coeficientes[i])*this.grado);
		}
		return resultado;
	}
	double evaluarRecursiva(double x) {
		
	}
	double evaluarRecursivaPar(double x) {
		
	}
	double evaluarProgDinamica(double x) {
		
	}
	double evaluarMejorada(double x) {
		
	}
	double evaluarPow(double x) {
		
	}
	double evaluarHorner(double x) {
		double [] b;
		b = new double[this.coeficientes.length];
		b[this.grado] = this.coeficientes[this.grado];
		for(int i = this.grado-1;i>=0;i--) {
			b[i] = this.coeficientes[i]+b[i+1]*x;
		}
		return b[0];
		
	}
	
}
