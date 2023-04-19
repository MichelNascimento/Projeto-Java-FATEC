package prova;

public class Dados_Condomio {
    public static void main(String[] args) {
        
        Condominio a = new Condominio();

        a.set_nome("Jardin das FLores");
        a.set_endereco("Rua A, nº45");
        a.set_quantidade(22);

        System.out.println("Nome do COndomínio: \t" + a.get_nome());
        System.out.println("Endereço: \t" + a.get_endereco());
        System.out.println("Quantidade de apartamentos: \t" + a.get_quantidade());

    /******************************************/
    /*QUESTÃO 3: inserir 4º atributo*/
        Condominio b = new Condominio(360.00);
        System.out.println("Proço do condomínio: R$\t" + b.get_valor());
    }    
}
