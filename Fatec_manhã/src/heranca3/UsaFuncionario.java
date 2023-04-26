package heranca3;
import javax.swing.JOptionPane;

public class UsaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        PessoaJuridica func = new PessoaJuridica();

        String u, v, t, z;
        int x;

        z = JOptionPane.showInputDialog("[1] - PF \n[2] - PJ");
        x = Integer.parseInt(z);
        if(z.length() == 1){
            switch(x){
                case 1:{
                    //u = JOptionPane.showInputDialog("Escreva o nome do contribuinte: ");
                    funcionario.setNome(JOptionPane.showInputDialog("Escreva o nome do contribuinte: "));
                    v = JOptionPane.showInputDialog("Escreva o RG: ");
                    t = JOptionPane.showInputDialog("Escreva a identificação do cartão: ");


                    //funcionario.setNome(u);
                    funcionario.setRg(v);
                    funcionario.setCartao(t);
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("RG: " + funcionario.getRg());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    break;                    
                }
                case 2:{
                    u = JOptionPane.showInputDialog("Escreva o nome do contribuinte: ");
                    //fun.setNome(JOptionPane.showInputDialog("Escreva o nome do contribuinte: "));
                    v = JOptionPane.showInputDialog("Escreva o CNPJ: ");
                    t = JOptionPane.showInputDialog("Escreva a identificação do cartão: ");

                    funcionario.setNome(u);
                    func.setCnpj(v);
                    funcionario.setCartao(t);
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("CNPJ: " + func.getCnpj());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null,
                    "oPÇÃO INVÁLIDA",
                    "PopUp Dialog",
                    JOptionPane.INFORMATION_MESSAGE); 
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,
            "Hi, In the message box",
            "PopUp Dialog",
            JOptionPane.INFORMATION_MESSAGE);        
        }
    }    
}