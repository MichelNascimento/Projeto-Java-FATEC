package heranca2;

public class Acessa_Faculdade {
    public static void main(String[] args) {
        Faculdade_CEETEPs ceetps = new Faculdade_CEETEPs();
        Disciplina_CEETEPs disciplina = new Disciplina_CEETEPs();

        ceetps.setFatec("Fatec Baixada Santista");
        System.out.println("Fatec:\t" + ceetps.getFatec());

        ceetps.setFaculdade("ADS");
        System.out.println("Faculdade:\t" + ceetps.getFaculdade());

        disciplina.setDisciplina("Programação Orientada a Objeto");
        System.out.println("Disciplina:\t" + disciplina.getDisciplina());
    }
    
}
