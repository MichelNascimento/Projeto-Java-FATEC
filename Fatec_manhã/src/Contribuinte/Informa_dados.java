package contribuinte;
import javax.swing.JOptionPane;

public class Informa_dados {
	public static void main(String args[]) {
		
		Dados_Contribuintes a = new Dados_Contribuintes();
		String nom;
		String cp;
		String cn;
		String car;
				
		nom = JOptionPane.showInputDialog("Digite o nome: ");
		cp = JOptionPane.showInputDialog("Digite o CPF ");
		cn = JOptionPane.showInputDialog("Digite o CNPJ ");
		car = JOptionPane.showInputDialog("Digite o numero do cartão ");
		
		a.setNome(nom);		
		a.setCPF(cp);
		a.setCNPJ(cn);
		a.setCartao(car);
		
		System.out.println("Nome:\t" + a.getNome());
		System.out.println("CPF:\t" + a.getCPF());
		System.out.println("CNPJ:\t" + a.getCNPJ());
		System.out.println("Cartão:\t" + a.getCartao());
	}

}
