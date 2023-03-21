package ActividadObjetos;

public class Monedas {
	double euros, dolares;
	double cambioeu = 1.09;
	double cambiodol =0.91;

	public double getCambiodol() {
		return cambiodol;
	}

	public void setCambiodol(double cambiodol) {
		this.cambiodol = cambiodol;
	}

	public Monedas(double euros, double dolares) {
		super();
		this.euros = euros;
		this.dolares = dolares;
	}

	public double getEuros() {
		return euros;
	}

	public void setEuros(double euros) {
		this.euros = euros;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}

	public double getCambioeu() {
		return cambioeu;
	}

	public void setCambioeu(double cambioeu) {
		this.cambioeu = cambioeu;
	}
	
	public double EurosDolares() {
		return (this.euros*this.cambioeu);	
	}
	
	public double DolaresEuros() {
		return (this.dolares*this.cambiodol);	
	}
}
