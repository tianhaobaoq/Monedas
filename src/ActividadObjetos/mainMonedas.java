package ActividadObjetos;

import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * Método main donde se realizan las conversiones (euro-dolar/dolar-euro) y se establece el cambio de divisa
 * @author Abimael
 *
 */
public class mainMonedas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double dolares=0;
		double euros=0;
		Monedas moneda = new Monedas(euros, dolares);
		boolean seguir=true;;
		try {
		do {	
			String tipo = JOptionPane.showInputDialog("Introduzca 'e' para cambiar de euros a dólares ; 'd' de dólares a euros ; 'c' para cambiar los tipos de cambio ; 'q' para salir");
			tipo = tipo.toLowerCase();
			try {
			if (tipo.equals("e")) {
				euros = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de euros"));
				moneda.setEuros(euros);
				dolares = moneda.EurosDolares();
				moneda.setDolares(dolares);
				System.out.println("Al cambio(" + moneda.getCambioeu() + ") " + euros + " € , son " + dolares + " $.");
			}
			
			if(tipo.equals("d")) {
				dolares = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de dólares"));
				moneda.setDolares(dolares);
				euros = moneda.DolaresEuros();
				moneda.setEuros(euros);
				System.out.println("Al cambio(" + moneda.getCambiodol() + ") " + dolares + " $ , son " + euros + " €.");
			}
			if(tipo.equals("c") ) {
				double cambioeu = Double.parseDouble(JOptionPane.showInputDialog("1€ vale ..."));
				moneda.setCambioeu(cambioeu);
				double cambiodol = Double.parseDouble(JOptionPane.showInputDialog("1$ vale ..."));
				moneda.setCambiodol(cambiodol);
				System.out.println("Los nuevos valores son: " + "1€ = " + moneda.getCambioeu() + "€ / 1$ = " + moneda.getCambiodol() + "€.");
			}
			
			if(tipo.equals("q")) {
				seguir=false;
				break;
			}
			
			}catch(NumberFormatException ea) {
				JOptionPane.showMessageDialog (null, "Inserte un valor válido", "ERROR_0323213", JOptionPane.ERROR_MESSAGE);
			}
		
		}while(seguir=true);
		
		}catch (NullPointerException e) {
			System.err.println();
		}
	}
}
